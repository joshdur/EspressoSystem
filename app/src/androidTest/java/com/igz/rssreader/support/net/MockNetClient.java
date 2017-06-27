package com.igz.rssreader.support.net;

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

public class MockNetClient implements NetClient {

    private final HashMap<String, Response> hashResponse = new LinkedHashMap<>();
    private final NetClient netClient;

    public MockNetClient(NetClient netClient) {
        this.netClient = netClient;
    }

    public void setResponse(String urlMatch, int statusCode, String bodyResponse) {
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

    private Response getResponse(Request request){
        Response response = hashResponse.get(request.url);
        if (response != null) {
            return response;
        }
        for (Map.Entry<String, Response> entry : hashResponse.entrySet()) {
            if (request.url.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void netRequest(Request request) throws NetClientException {

    }

    @Override
    public void netAuthRequest(Request request) throws NetClientException {

    }

    @Override
    public <T> T netRequest(Request request, ResponseProcessor<T> processor) throws NetClientException {
        Response response = getResponse(request);
        return response != null ? processor.process(response) : netClient.netRequest(request, processor);
    }

    @Override
    public <T> T netAuthRequest(Request request, ResponseProcessor<T> processor) throws NetClientException {
        Response response = getResponse(request);
        return response != null ? processor.process(response) : netClient.netAuthRequest(request, processor);

    }
}
