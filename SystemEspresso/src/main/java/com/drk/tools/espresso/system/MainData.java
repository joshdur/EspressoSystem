package com.drk.tools.espresso.system;

import android.content.Intent;

public class MainData {

    public final Class<?> mainActivityClass;
    public final Intent startIntent;

    private MainData(Class<?> mainActivityClass, Intent startIntent) {
        this.mainActivityClass = mainActivityClass;
        this.startIntent = startIntent;
    }

    public boolean hasIntent(){
        return startIntent != null;
    }

    public static MainData launch(Class<?> mainActivityClass){
        return new MainData(mainActivityClass, null);
    }

    public static MainData launchWith(Class<?> mainActivityClass, Intent intent){
        return new MainData(mainActivityClass, intent);
    }
}
