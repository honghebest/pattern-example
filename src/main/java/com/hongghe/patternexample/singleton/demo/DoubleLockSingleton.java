package com.hongghe.patternexample.singleton.demo;

/**
 * @author: hongghe @date: 2019-03-12 11:32
 */
public class DoubleLockSingleton {

    private volatile static DoubleLockSingleton doubleLockSingleton;

    private DoubleLockSingleton() {}

    public static DoubleLockSingleton getInstance() {
        if (doubleLockSingleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (doubleLockSingleton == null) {
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
