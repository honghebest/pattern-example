package com.hongghe.patternexample.singleton.demo;

/**
 * @author: hongghe @date: 2019-03-12 11:26
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
