package com.igz.rssreader.mock;


import com.drk.tools.espresso.system.EspressoSystem;
import com.igz.rssreader.instrument.AppInjector;
import com.igz.rssreader.instrument.Injector;
import com.intelygenz.android.netclient.NetClient;
import com.intelygenz.android.netclient.NetClientException;
import com.intelygenz.android.netclient.Request;
import com.intelygenz.android.netclient.Response;
import com.intelygenz.android.netclient.ResponseProcessor;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MockEngine implements EspressoSystem.MockCallback<MockReference> {

    private final MockInjector mockInjector;
    private final MockNetClient mockNetClient;

    public MockEngine() {
        this.mockInjector = mockInjector();
        this.mockNetClient = new MockNetClient();
        mockInjector.addMock(NetClient.class, mockInjector);
    }

    @Override
    public void performMocks(MockReference mock) {
        switch (mock) {
            case REQUEST_NEWS_LIST_CORRECT:
                mockNetClient.setResponse("http://ep00.epimg.net/rss/elpais/portada.xml", 200, Mocks.VALID_XML);
                break;
            case REQUEST_NEWS_LIST_FAILED:
                mockNetClient.setResponse("http://ep00.epimg.net/rss/elpais/portada.xml", 404, "");
                break;
            case SCENARIO3:
                break;
        }

    }


    private MockInjector mockInjector() {
        Injector initialInjector = AppInjector.getInjector();
        MockInjector mockInjector = new MockInjector(initialInjector);
        AppInjector.initInjector(mockInjector);
        return mockInjector;
    }


    private static class MockNetClient implements NetClient {

        private final HashMap<String, Response> hashResponse = new LinkedHashMap<>();

        void setResponse(String urlMatch, int statusCode, String bodyResponse) {
            try {
                InputStream stream = new ByteArrayInputStream(bodyResponse.getBytes("UTF-8"));
                Response response = new Response.Builder(statusCode)
                        .message(stream)
                        .build();
                hashResponse.put(urlMatch, response);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        private Response getResponse(Request request) {
            Response response = hashResponse.get(request.url);
            if (response != null) {
                return response;
            }
            for (Map.Entry<String, Response> entry : hashResponse.entrySet()) {
                if (request.url.contains(entry.getKey())) {
                    return entry.getValue();
                }
            }
            return new Response.Builder(501).build();
        }

        @Override
        public void netRequest(Request request) throws NetClientException {

        }

        @Override
        public void netAuthRequest(Request request) throws NetClientException {

        }

        @Override
        public <T> T netRequest(Request request, ResponseProcessor<T> processor) throws NetClientException {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return processor.process(getResponse(request));
        }

        @Override
        public <T> T netAuthRequest(Request request, ResponseProcessor<T> processor) throws NetClientException {
            return processor.process(getResponse(request));
        }
    }


    private static class MockInjector implements Injector {

        private final HashMap<Class, Object> mockInjections;
        private final Injector injector;

        private MockInjector(Injector injector) {
            this.mockInjections = new LinkedHashMap<>();
            this.injector = injector;
        }

        void addMock(Class tClass, Object object) {
            mockInjections.put(tClass, object);
        }

        @Override
        public <T> T inject(Class<T> tClass) {
            if (mockInjections.containsKey(tClass)) {
                //noinspection unchecked
                return (T) mockInjections.get(tClass);
            }
            return injector.inject(tClass);
        }
    }
}
