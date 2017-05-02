package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;

import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.ElementState;
import com.drk.tools.contextandroid.domain.Scenario;
import com.drk.tools.contextandroid.domain.ViewInfo;
import com.igz.rssreader.instrument.AppInjector;
import com.igz.rssreader.instrument.Injector;
import com.igz.rssreader.mock.MockEngine;
import com.igz.rssreader.mock.MockInjector;
import com.igz.rssreader.mock.MockReference;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.igz.rssreader.Definition.buildChecker;

@RunWith(AndroidJUnit4.class)
public class FilterNewsTests {

    private AppChecker planner;

    @Before
    public void before() {
        Injector initialInjector = AppInjector.getInjector();
        MockInjector mockInjector = new MockInjector(initialInjector);
        AppInjector.initInjector(mockInjector);
        this.planner = buildChecker(new MockEngine(mockInjector));
    }

    /**
     * Scenario: Show a list of filtered news
     * Given User is on news list and data is ok
     * When user input a founded key string in news list search box
     * Then a list of news filtered by input
     */
    @Test
    public void showFilteredNews() throws Throwable {
        Scenario scenario = Scenario.builder()
                .withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
                .withCheckedScreen(Definition.SCREEN_LIST_NEWS)
                .withElementClicked(R.id.news_fragment_menu_searchview)
                .withInputText(ViewInfo.builder()
                        .hint("Search by title")
                        .build(), "historia", true)
                .withCheckedTextForAll(ViewInfo.of(R.id.news_holder_component_title_textview), "historia")
                .build();
        planner.assertScenario(scenario, 1);
    }

    /**
     * Scenario: Show a list of filtered news
     * Given User is on news list and data is ok
     * When user input an not found key string in news list search box
     * Then an empty news list is showed
     */
    @Test
    public void showEmptyFilterList() throws Throwable {
        Scenario scenario = Scenario.builder()
                .withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
                .withCheckedScreen(Definition.SCREEN_LIST_NEWS)
                .withElementClicked(R.id.news_fragment_menu_searchview)
                .withInputText(ViewInfo.builder()
                        .hint("Search by title")
                        .build(), "asdf", true)
                .withElementState(ViewInfo.of(R.id.news_holder_component_title_textview), ElementState.State.NON_DISPLAYED)
                .build();
        planner.assertScenario(scenario, 1);
    }

}
