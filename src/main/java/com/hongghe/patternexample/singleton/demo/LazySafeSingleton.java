package com.hongghe.patternexample.singleton.demo;

/**
 * @author: hongghe @date: 2019-03-12 11:23
 */
public class LazySafeSingleton {

    private static LazySafeSingleton lazySafeSingleton;

    private LazySafeSingleton() {}

    public static synchronized LazySafeSingleton getInstance() {
        if (lazySafeSingleton == null) {
            lazySafeSingleton = new LazySafeSingleton();
        }
        return lazySafeSingleton;
    }
}
