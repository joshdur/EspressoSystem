package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;

import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.Scenario;
import com.igz.rssreader.instrument.AppInjector;
import com.igz.rssreader.instrument.Injector;
import com.igz.rssreader.mock.MockEngine;
import com.igz.rssreader.support.injection.MockInjector;
import com.igz.rssreader.mock.MockReference;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.igz.rssreader.TestContext.buildChecker;

@RunWith(AndroidJUnit4.class)
public class AccessNewsDetailTests {

    @Before
    public void before() {
        TestContext.initMockInjector();
    }

    /**
     * Scenario: Show a list of news
     * Given User is on news list and data is ok
     * When User click on a valid news in the list
     * Then A detail screen is showed
     */
    @Test
    public void showDetails() throws Throwable {
        Scenario scenario = Scenario.builder()
                .withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
                .withCheckedScreen(TestContext.SCREEN_LIST_NEWS)
                .withElementClicked(R.id.news_holder_component_imageview)
                .withCheckedScreen(TestContext.SCREEN_NEWS_DETAILS)
                .build();
        AppChecker appChecker = TestContext.buildChecker();
        appChecker.assertScenario(scenario, 1);
    }

}
