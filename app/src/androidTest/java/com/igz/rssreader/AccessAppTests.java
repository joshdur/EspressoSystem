package com.igz.rssreader;

import android.support.test.runner.AndroidJUnit4;
import com.drk.tools.contextandroid.AndroidSystem;
import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.AndroidViewInfo;
import com.drk.tools.espresso.system.EspressoSystem;
import com.drk.tools.espresso.system.MainData;
import com.igz.rssreader.mock.MockEngine;
import com.igz.rssreader.ui.feats.home.HomeActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AccessAppTests {

	private static AppChecker buildChecker(){
		AndroidViewInfo androidViewInfo = ScreenDefinition.build();
		MainData mainData = MainData.launch(HomeActivity.class);
		MockEngine mockEngine = new MockEngine();
		AndroidSystem androidSystem = new EspressoSystem<>(mainData, mockEngine);
		return new AppChecker(androidViewInfo, androidSystem, true);
	}

	@Test
	public void showListOfNews() throws Throwable {
	//	AppChecker planner = buildChecker();
	//	Scenario scenario = Scenario.builder()
	//			.mock(MockReference.SCENARIO1)
	//			.clicked(1)
	//			.checkAt(ScreenDefinition.SCREEN_NEWS_DETAILS)
	//			.build();
	//	planner.assertScenario(scenario, 3);
	}

	public void showConnectivityError() {
	}

	@Test
	public void showDetails() throws Throwable{
	//	State goalState = new SetStateBuilder()
	//		.set(screenChecked, NEWS_DETAIL)
	//		.set(appStateIs, AppState.CLOSED)
	//		.build();
	//	Scene scene = testPlanner.getSingleScene(goalState);
	//	scene.resolve();
	}
}
