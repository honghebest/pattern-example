package com.hongghe.patternexample.singleton.lazy;

/**
 * @author: hongghe @date: 2019-04-18 11:49
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }
}
