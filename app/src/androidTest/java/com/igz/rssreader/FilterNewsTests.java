package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;

import com.drk.tools.contextandroid.AndroidSystem;
import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.AndroidViewInfo;
import com.drk.tools.contextandroid.domain.Scenario;
import com.drk.tools.contextandroid.domain.ViewInfo;
import com.drk.tools.espresso.system.EspressoSystem;
import com.drk.tools.espresso.system.MainData;
import com.igz.rssreader.mock.MockEngine;
import com.igz.rssreader.mock.MockReference;
import com.igz.rssreader.ui.feats.home.HomeActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.igz.rssreader.Definition.buildChecker;

@RunWith(AndroidJUnit4.class)
public class FilterNewsTests {

	/**
	 * Scenario: Show a list of filtered news
	 * Given User is on news list and data is ok
	 * When user input a founded key string in news list search box
	 * Then a list of news filtered by input
	 */
	@Test
	public void showFilteredNews() throws Throwable {
		AppChecker planner = buildChecker();
		Scenario scenario = Scenario.builder()
				.withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
				.withCheckedScreen(Definition.SCREEN_LIST_NEWS)
				.withElementClicked(R.id.news_fragment_menu_searchview)
				.withInputText(ViewInfo.builder()
						.hint("Search by title")
						.build(), "cristina")
				.build();
		planner.assertScenario(scenario, 3);
	}

	/**
	 * Scenario: Show a list of filtered news
	 * Given User is on news list and data is ok
	 * When user input an not found key string in news list search box
	 *Then an empty news list is showed
	 */
	@Test
	public void showEmptyFilterList() throws Throwable {
		AppChecker planner = buildChecker();
		Scenario scenario = Scenario.builder()
				.withMocked(MockReference.REQUEST_NEWS_LIST_CORRECT)
				.withCheckedScreen(Definition.SCREEN_LIST_NEWS)
				.withInputText(ViewInfo.builder()
						.hint("Search by title")
						.build(), "papa")
				.build();
		planner.assertScenario(scenario, 3);
	}

}
