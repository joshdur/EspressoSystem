package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;

import com.drk.tools.contextandroid.AndroidSystem;
import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.AndroidViewInfo;
import com.drk.tools.contextandroid.domain.Scenario;
import com.drk.tools.espresso.system.EspressoSystem;
import com.drk.tools.espresso.system.MainData;
import com.igz.rssreader.mock.MockEngine;
import com.igz.rssreader.mock.MockReference;
import com.igz.rssreader.ui.feats.home.HomeActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.igz.rssreader.Definition.buildChecker;

@RunWith(AndroidJUnit4.class)
public class AccessNewsDetailTests {

	/**
	 * Scenario: Show a list of news
	 * Given User is on news list and data is ok
	 * When User click on a valid news in the list
	 * Then A detail screen is showed
	 */
	@Test
	public void showDetails() throws Throwable {
		AppChecker planner = buildChecker();
		Scenario scenario = Scenario.builder()
				.withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
				.withCheckedScreen(Definition.SCREEN_LIST_NEWS)
				.withElementClicked(R.id.news_holder_component_title_textview)
				.withCheckedScreen(Definition.SCREEN_NEWS_DETAILS)
				.build();
		planner.assertScenario(scenario, 1);
	}

}
