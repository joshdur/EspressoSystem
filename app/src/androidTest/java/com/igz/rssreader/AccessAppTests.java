package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;

import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.ElementState;
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
public class AccessAppTests {

	@Before
	public void before(){
		TestContext.initMockInjector();
	}


	/**
	 *  Scenario: Show a list of news
	 *  Given User is on news list and data is ok
	 *  Then A list of news is showed
	 */
	@Test
	public void showListOfNews() throws Throwable {
		Scenario scenario = Scenario.builder()
				.withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
				.withCheckedScreen(TestContext.SCREEN_LIST_NEWS)
				.withElementState(R.id.news_fragment_recyclerview, ElementState.State.DISPLAYED)
				.build();
		AppChecker appChecker = TestContext.buildChecker();
		appChecker.assertScenario(scenario, 1);
	}

	/**
	 * Scenario: Show a connectivity error message
	 * Given User is on news list and data is ko
	 * Then A connectivity error showed
	 */
	@Test
	public void showConnectivityError() throws Throwable {
		Scenario scenario = Scenario.builder()
				.withMocked(MockReference.REQUEST_NEWS_LIST_FAILED)
				.withCheckedScreen(TestContext.SCREEN_LIST_NEWS)
				.withElementState(R.id.news_fragment_info_textview, ElementState.State.DISPLAYED)
				.build();
		AppChecker appChecker = TestContext.buildChecker();
		appChecker.assertScenario(scenario, 1);
	}

}
