package com.igz.rssreader.mock;


import com.drk.tools.espresso.system.EspressoSystem;
import com.igz.rssreader.instrument.AppInjector;
import com.igz.rssreader.instrument.Injector;
import com.igz.rssreader.support.net.MockNetClient;
import com.intelygenz.android.netclient.NetClient;

public class MockEngine implements EspressoSystem.MockCallback<MockReference> {

    @Override
    public void performMocks(MockReference mock) {
        AppInjector.getInjector().inject(NetClient.class);
        switch (mock) {
            case REQUEST_NEWS_LIST_CORRECT:
                mockResponse("http://ep00.epimg.net/rss/elpais/portada.xml", 200, "mockResponses/news_list");
                break;
            case REQUEST_NEWS_LIST_FAILED:
                mockResponse("http://ep00.epimg.net/rss/elpais/portada.xml", 404, "");
                break;
            case SCENARIO3:
                break;
        }
    }

    private void mockResponse(String url, int statusCode, String path){
        Injector injector = AppInjector.getInjector();
        MockNetClient mockNetClient = (MockNetClient) injector.inject(NetClient.class);
        String responseBody = ResponseProvider.loadFile(path);
        mockNetClient.setResponse(url, statusCode, responseBody);
    }


}
