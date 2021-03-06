package com.igz.rssreader.support.injection;

import com.igz.rssreader.instrument.Injector;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class MockInjector implements Injector {

    private final HashMap<Class, Object> mockInjections;
    private final Injector injector;

    public MockInjector(Injector injector) {
        this.mockInjections = new LinkedHashMap<>();
        this.injector = injector;
    }

    public void addMock(Class tClass, Object object) {
        mockInjections.put(tClass, object);
    }

    @Override
    public <T> T inject(Class<T> tClass) {
        if (mockInjections.containsKey(tClass)) {
            //noinspection unchecked
            return (T) mockInjections.get(tClass);
        }
        return injector.inject(tClass);
    }
}
