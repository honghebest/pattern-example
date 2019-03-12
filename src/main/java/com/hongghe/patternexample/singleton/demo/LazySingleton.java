package com.hongghe.patternexample.singleton.demo;

/**
 * @author: hongghe @date: 2019-03-12 11:21
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
