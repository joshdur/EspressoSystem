package com.drk.tools.espresso.system;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;

import com.drk.tools.contextandroid.AndroidSystem;
import com.drk.tools.contextandroid.domain.ScreenInfo;
import com.drk.tools.contextandroid.domain.ViewInfo;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class EspressoSystem<E extends Enum> implements AndroidSystem {

    public interface MockCallback<E extends Enum> {

        void performMocks(E mock);

    }

    private final MainData mainData;
    private final MockCallback<E> mockCallback;

    private Activity activity;

    public EspressoSystem(MainData mainData, MockCallback<E> mockCallback) {
        this.mainData = mainData;
        this.mockCallback = mockCallback;
    }

    @Override
    public void mock(Enum anEnum) {
        //noinspection unchecked
        mockCallback.performMocks((E) anEnum);
    }

    @Override
    public void launchApp(ScreenInfo screenInfo) {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        final String targetPackage = instrumentation.getTargetContext().getPackageName();
        Intent startIntent = mainData.hasIntent() ? mainData.startIntent : new Intent(Intent.ACTION_MAIN);
        startIntent.setClassName(targetPackage, mainData.mainActivityClass.getName());
        startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity = instrumentation.startActivitySync(startIntent);
        instrumentation.waitForIdleSync();
        if(activity == null){
            throw new EspressoSystemException("Failed to launchApp - activity is null");
        }

    }

    @Override
    public void checkScreen(ScreenInfo screenInfo) {
        for(ViewInfo viewInfo : screenInfo.views){
            try{
                performCheckVisibility(viewInfo);
                return;
            }catch (EspressoSystemException ignored){
            }
        }
        throw new EspressoSystemException("Could not check screen %s, any of its views is visible?", screenInfo.name);
    }

    @Override
    public void checkVisibility(ViewInfo viewInfo) {
        performCheckVisibility(viewInfo);
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    private void performCheckVisibility(ViewInfo viewInfo) {
        Throwable throwable = tryCheck(withId(viewInfo.id), matches(isDisplayed()));
        if(throwable != null && viewInfo.text != null){
            throwable = tryCheck(withText(viewInfo.text), matches(isDisplayed()));
        }
        if(throwable != null) {
            String message = "Failed to CheckVisibility of view [id= %d, text=%s]";
            throw new EspressoSystemException(throwable, message, viewInfo.id, viewInfo.text);
        }
    }

    @Override
    public void checkText(ViewInfo viewInfo, String text) {
        onView(withId(viewInfo.id)).check(matches(ViewMatchers.withText(text)));
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    @Override
    public void inputText(ViewInfo viewInfo, String inputText) {
        onView(withId(viewInfo.id))
                .perform(ViewActions.click())
                .perform(ViewActions.typeTextIntoFocusedView(inputText))
                .perform(ViewActions.closeSoftKeyboard())
                .check(matches(ViewMatchers.withText(inputText)));
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    @Override
    public void clickElement(ViewInfo viewInfo) {
        onView(withId(viewInfo.id))
                .perform(ViewActions.click());
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    @Override
    public void performBack() {
        Espresso.pressBack();
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    @Override
    public void closeApp() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }


    private Throwable tryCheck(Matcher<View> viewMatcher, ViewAssertion viewAssertion, ViewAction... actions){
        try{
            ViewInteraction viewInteraction = onView(viewMatcher);
            if(actions.length > 0) {
                viewInteraction = viewInteraction.perform(actions);
            }
            if(viewAssertion != null) {
                viewInteraction.check(viewAssertion);
            }
            return null;
        } catch (Exception e){
            return e;
        }
    }
}
