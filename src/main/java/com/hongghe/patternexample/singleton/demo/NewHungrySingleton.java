package com.hongghe.patternexample.singleton.demo;

/**
 * @author: hongghe @date: 2019-03-12 11:26
 */
public class NewHungrySingleton {

    private static NewHungrySingleton newHungrySingleton = null;

    static {
        newHungrySingleton = new NewHungrySingleton();
    }

    private NewHungrySingleton() {}

    public static NewHungrySingleton getInstance() {
        return newHungrySingleton;
    }
}
