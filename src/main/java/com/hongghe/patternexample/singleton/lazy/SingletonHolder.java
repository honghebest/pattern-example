package com.hongghe.patternexample.singleton.lazy;

/**
 * @author: hongghe @date: 2019-04-18 11:51
 */
public class SingletonHolder {

    private SingletonHolder() {}

    private static class LazyHolder {
        private static final SingletonHolder singletonHolder = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return LazyHolder.singletonHolder;
    }
}
