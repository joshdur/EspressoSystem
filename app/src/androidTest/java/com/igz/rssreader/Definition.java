package com.igz.rssreader;

import com.drk.tools.contextandroid.AndroidSystem;
import com.drk.tools.contextandroid.AppChecker;
import com.drk.tools.contextandroid.domain.Action;
import com.drk.tools.contextandroid.domain.AndroidViewInfo;
import com.drk.tools.contextandroid.domain.IntentData;
import com.drk.tools.contextandroid.domain.ScreenInfo;
import com.drk.tools.contextandroid.domain.ViewInfo;
import com.drk.tools.espresso.system.EspressoSystem;
import com.drk.tools.espresso.system.MainData;
import com.igz.rssreader.mock.MockEngine;
import com.igz.rssreader.mock.MockReference;
import com.igz.rssreader.ui.feats.home.HomeActivity;

public class Definition {

    public static String SCREEN_LIST_NEWS = "list_news";
    public static String SCREEN_NEWS_DETAILS = "news_details";


    public static AppChecker buildChecker(MockEngine mockEngine) {
        AndroidViewInfo androidViewInfo = Definition.build();
        MainData mainData = MainData.launch(HomeActivity.class);
        AndroidSystem androidSystem = new EspressoSystem<>(mainData, mockEngine);
        return new AppChecker(androidViewInfo, androidSystem, true);
    }

    private static AndroidViewInfo build() {
        return AndroidViewInfo.builder()
                .addMocks(MockReference.values())
                .addScreen(listNewsScreen())
                .addScreen(newsDetailsScreen())
                .build();
    }

    private static ScreenInfo listNewsScreen() {
        ViewInfo loading = ViewInfo.of(R.id.news_fragment_progressbar);
        return ScreenInfo.builder(SCREEN_LIST_NEWS)
                .addView(ViewInfo.of(R.id.news_fragment_info_textview))
                .addView(ViewInfo.builder()
                        .id(R.id.news_fragment_recyclerview)
                        .showsAfter(loading)
                        .build())
                .addView(ViewInfo.builder()
                        .id(R.id.news_holder_component_imageview)
                        .showsAfter(loading)
                        .click(Action.changeToScreen(SCREEN_NEWS_DETAILS))
                        .build())
                .addView(ViewInfo.builder()
                        .id(R.id.news_fragment_menu_searchview)
                        .click(Action.addViews(ViewInfo.builder()
                                .hint("Search by title")
                                .imeOptionsClickAction(Action.addViews(ViewInfo.builder()
                                        .id(R.id.news_holder_component_title_textview)
                                        .showsAfter(loading)
                                        .build()))
                                .build()))
                        .build())
                .build();
    }

    private static ScreenInfo newsDetailsScreen() {
        return ScreenInfo.builder(SCREEN_NEWS_DETAILS)
                .addView(ViewInfo.builder()
                        .id(R.id.news_detail_fragment_go_browser_button)
                        .click(Action.launchIntent(IntentData.withAction(android.content.Intent.ACTION_VIEW)))
                        .build())
                .back(Action.changeToScreen(SCREEN_LIST_NEWS))
                .build();
    }

}