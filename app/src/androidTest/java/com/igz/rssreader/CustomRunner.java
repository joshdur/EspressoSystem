package com.igz.rssreader;

import android.app.Instrumentation;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import android.support.test.internal.util.AndroidRunnerParams;
import com.igz.rssreader.testing.testdomain.literals.main.specific.ViewElement;
import org.junit.runners.model.InitializationError;

public class CustomRunner extends AndroidJUnit4ClassRunner {

	public CustomRunner(Class<?> testClass) throws InitializationError {
		super(testClass, getParams());
	}

	private static AndroidRunnerParams getParams() {
		Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
		Bundle bundle = new Bundle();
		boolean skipExecution = false;
		long perTestTimeout = Long.MAX_VALUE;
		boolean ignoreSuitMethods = true;
		ViewElement.values();
		return new AndroidRunnerParams(instrumentation, bundle, skipExecution, perTestTimeout, ignoreSuitMethods);
	}

	public CustomRunner(Class<?> klass, AndroidRunnerParams runnerParams) throws InitializationError {
		super(klass, runnerParams);
	}

	//@Override
	//protected List<FrameworkMethod> computeTestMethods() {
	//	List<FrameworkMethod> frameworkMethods = new ArrayList<>();
	//	frameworkMethods.addAll(super.computeTestMethods());
	//	final TestClass testClass = getTestClass();
	//	frameworkMethods.addAll(TestGenerator.generateTests(testClass));
	//	return frameworkMethods;
	//}

}
