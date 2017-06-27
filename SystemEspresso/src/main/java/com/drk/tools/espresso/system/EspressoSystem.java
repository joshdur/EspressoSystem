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
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.matcher.IntentMatchers;
import android.support.test.espresso.matcher.ViewMatchers;
import android.text.TextUtils;
import android.view.View;

import com.drk.tools.contextandroid.AndroidSystem;
import com.drk.tools.contextandroid.domain.ElementInputText;
import com.drk.tools.contextandroid.domain.ElementState;
import com.drk.tools.contextandroid.domain.ElementText;
import com.drk.tools.contextandroid.domain.IntentData;
import com.drk.tools.contextandroid.domain.ScreenInfo;
import com.drk.tools.contextandroid.domain.ViewInfo;
import com.drk.tools.espresso.system.matchers.CustomMatchers;

import org.hamcrest.Matcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.matcher.ViewMatchers.Visibility.*;
import static android.support.test.espresso.matcher.ViewMatchers.hasFocus;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;


public class EspressoSystem<E extends Enum> implements AndroidSystem {

    private final static long DEFAULT_WAIT_TIMEOUT = 15000;
    private final static long DEFAULT_CHECK_EVERY = 2000;

    public interface MockCallback<E extends Enum> {

        void performMocks(E mock);

    }

    private final MainData mainData;
    private final MockCallback<E> mockCallback;
    private final long timeout;
    private final long checkTime;

    private Activity activity;

    public EspressoSystem(MainData mainData, MockCallback<E> mockCallback) {
        this.mainData = mainData;
        this.mockCallback = mockCallback;
        this.timeout = DEFAULT_WAIT_TIMEOUT;
        this.checkTime = DEFAULT_CHECK_EVERY;
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
        if (activity == null) {
            throw new EspressoSystemException("Failed to launchApp - activity is null");
        }

    }

    @Override
    public void checkIntent(IntentData intentData) {
        try {
            intended(hasIntentData(intentData));
        } catch (Exception e) {
            throw new EspressoSystemException(e, "Failed to checkIntent %s", intentData.toString());
        }
    }

    private Matcher<Intent> hasIntentData(IntentData intentData) {
        if (!TextUtils.isEmpty(intentData.action)) {
            return IntentMatchers.hasAction(containsString(intentData.action));
        } else if (!TextUtils.isEmpty(intentData.aPackage)) {
            return IntentMatchers.hasPackage(intentData.aPackage);
        } else if (!TextUtils.isEmpty(intentData.component)) {
            return IntentMatchers.hasComponent(intentData.component);
        } else if (!TextUtils.isEmpty(intentData.uri)) {
            return IntentMatchers.hasData(intentData.uri);
        }
        throw new EspressoSystemException("Not valid IntentData");
    }

    @Override
    public void checkScreen(ScreenInfo screenInfo) {
        for (ViewInfo viewInfo : screenInfo.views) {
            try {
                performCheckVisibility(viewInfo, matches(isDisplayed()));
                return;
            } catch (EspressoSystemException ignored) {
            }
        }
        throw new EspressoSystemException("Could not check screen %s, any of its views is visible?", screenInfo.name);
    }

    @Override
    public void checkVisibility(ViewInfo viewInfo) {
        performCheckVisibility(viewInfo, matches(isDisplayed()));
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    @Override
    public void checkElementState(ViewInfo viewInfo, ElementState elementState) {
        switch (elementState.state) {
            case VISIBLE:
                performCheckVisibility(viewInfo, matches(withEffectiveVisibility(VISIBLE)));
                break;
            case INVISIBLE:
                performCheckVisibility(viewInfo, matches(withEffectiveVisibility(INVISIBLE)));
                break;
            case DISPLAYED:
                performCheckVisibility(viewInfo, matches(isDisplayed()));
                break;
            case NON_DISPLAYED:
                performCheckVisibility(viewInfo, doesNotExist());
                break;
        }
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    private void performCheckVisibility(ViewInfo viewInfo, ViewAssertion viewAssertion) {
        if (viewInfo.dependsOnView()) {
            waitForViewToDisappear(viewInfo.showsAfter);
        }
        checkVisibility(viewInfo, viewAssertion);
    }

    private void checkVisibility(ViewInfo viewInfo, ViewAssertion viewAssertion) {
        Throwable throwable = tryCheck(CustomMatchers.withIndex(withId(viewInfo.id), 0), viewAssertion);
        if (throwable != null && viewInfo.text != null) {
            throwable = tryCheck(CustomMatchers.withIndex(withText(viewInfo.text), 0), viewAssertion);
        }
        if (throwable != null) {
            String message = "Failed to CheckVisibility of view [id= %d, text=%s]";
            throw new EspressoSystemException(throwable, message, viewInfo.id, viewInfo.text);
        }
    }

    private void waitForViewToDisappear(ViewInfo viewInfo) {
        boolean viewDisplayed = true;
        long startTime = System.currentTimeMillis();
        while (viewDisplayed && (System.currentTimeMillis() - startTime) < timeout) {
            try {
                checkVisibility(viewInfo, matches(isDisplayed()));
            } catch (EspressoSystemException ignored) {
                viewDisplayed = false;
            }
            if (viewDisplayed) {
                try {
                    Thread.sleep(checkTime);
                } catch (InterruptedException e) {
                    throw new EspressoSystemException(e, "Test has been interrupted");
                }
            }
        }
        if (viewDisplayed) {
            throw new EspressoSystemException("Timeout while waiting %d to disappear", viewInfo.id);
        }
    }

    @Override
    public void checkText(ViewInfo viewInfo, ElementText elementText) {
        if (viewInfo.dependsOnView()) {
            waitForViewToDisappear(viewInfo.showsAfter);
        }

        Throwable throwable = tryCheck(withId(viewInfo.id), ViewAssertions.matches(ViewMatchers.withText(elementText.text)));
        if(throwable != null){
            throwable = tryCheck(CustomMatchers.withIndex(withId(viewInfo.id), 0), ViewAssertions.matches(ViewMatchers.withText(elementText.text)));
            throw new EspressoSystemException(throwable, "Failed to checkText in %s (checked index too)", viewInfo.toString());
        }

        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        instrumentation.waitForIdleSync();
    }

    @Override
    public void inputText(ViewInfo viewInfo, ElementInputText inputText) {
        if (viewInfo.dependsOnView()) {
            waitForViewToDisappear(viewInfo.showsAfter);
        }

        Matcher<View> matcher = null;
        if (viewInfo.id != -1) {
            matcher = withId(viewInfo.id);
        } else if (viewInfo.hint != null) {
            matcher = withHint(viewInfo.hint);
        }


        ViewInteraction interaction = onView(matcher)
                .perform(ViewActions.click())
                .perform(ViewActions.typeTextIntoFocusedView(inputText.text));
        interaction.perform(ViewActions.pressImeActionButton());
        interaction.perform(ViewActions.closeSoftKeyboard());
        //Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
       // instrumentation.waitForIdleSync();
    }

    @Override
    public void clickElement(ViewInfo viewInfo) {
        if (viewInfo.dependsOnView()) {
            waitForViewToDisappear(viewInfo.showsAfter);
        }

        onView(CustomMatchers.withIndex(withId(viewInfo.id), 0))
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
        //Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        //instrumentation.waitForIdleSync();
    }


    private Throwable tryCheck(Matcher<View> viewMatcher, ViewAssertion viewAssertion, ViewAction... actions) {
        try {
            ViewInteraction viewInteraction = onView(viewMatcher);
            if (actions.length > 0) {
                viewInteraction = viewInteraction.perform(actions);
            }
            if (viewAssertion != null) {
                viewInteraction.check(viewAssertion);
            }
            return null;
        } catch (Throwable e) {
            return e;
        }
    }
}
