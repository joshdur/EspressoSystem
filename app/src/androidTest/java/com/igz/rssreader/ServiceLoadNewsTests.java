package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;

import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.ElementState;
import com.drk.tools.contextandroid.domain.Scenario;
import com.igz.rssreader.mock.MockReference;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ServiceLoadNewsTests {

    @Before
    public void before() {
        TestContext.initMockInjector();
    }

    /**
     *   Scenario: Load news from net
     * Given Load news from net and data is ok
     Ç Then A list of news is returned
     */
    @Test
    public void loadNewsFromNet() throws Throwable {
        Scenario scenario = Scenario.builder()
                .withCheckedScreen(TestContext.SCREEN_LIST_NEWS)
                .withElementState(R.id.news_fragment_recyclerview, ElementState.State.DISPLAYED)
                .build();
        AppChecker appChecker = TestContext.buildChecker();
        appChecker.assertScenario(scenario, 1);
    }

}
