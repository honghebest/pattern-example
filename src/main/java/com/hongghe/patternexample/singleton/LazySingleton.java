package com.hongghe.patternexample.singleton;

/**
 * 懒汉式
 *
 * @author hongghe 07/2018
 */
public class LazySingleton {

    private LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public LazySingleton getInstance() {
        if (lazySingleton == null) {
            return new LazySingleton();
        }
        return lazySingleton;
    }
}
