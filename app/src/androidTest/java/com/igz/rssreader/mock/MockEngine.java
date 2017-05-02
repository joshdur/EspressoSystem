package com.igz.rssreader.mock;


import com.drk.tools.espresso.system.EspressoSystem;
import com.igz.rssreader.core.resource.Resources;
import com.igz.rssreader.core.source.Source;
import com.igz.rssreader.resource.RssProvider;
import com.igz.rssreader.source.SourceEngine;
import com.intelygenz.android.KeyValueKeeper;
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

    public MockEngine(MockInjector injector) {
        this.mockInjector = injector;
        this.mockNetClient = new MockNetClient();
        mockInjector.addMock(Source.class, new SourceEngine(injector.inject(KeyValueKeeper.class)));
        mockInjector.addMock(Resources.class, new RssProvider(mockNetClient, injector.inject(Source.class)));
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
            return processor.process(getResponse(request));
        }

        @Override
        public <T> T netAuthRequest(Request request, ResponseProcessor<T> processor) throws NetClientException {
            return processor.process(getResponse(request));
        }
    }


}
