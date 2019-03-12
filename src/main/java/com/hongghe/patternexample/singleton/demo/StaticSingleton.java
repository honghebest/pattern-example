package com.hongghe.patternexample.singleton.demo;

/**
 * @author: hongghe @date: 2019-03-12 11:29
 */
public class StaticSingleton {

    private static class Singleton {
        private static final StaticSingleton STATIC_SINGLETON = new StaticSingleton();
    }

    private StaticSingleton() {}

    public static final StaticSingleton getInstance() {
        return Singleton.STATIC_SINGLETON;
    }
}
