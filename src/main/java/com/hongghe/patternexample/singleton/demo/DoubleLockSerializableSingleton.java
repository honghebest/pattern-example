package com.hongghe.patternexample.singleton.demo;

import java.io.Serializable;

/**
 * @author: hongghe @date: 2019-03-12 11:41
 */
public class DoubleLockSerializableSingleton implements Serializable {

    private volatile  static DoubleLockSerializableSingleton doubleLockSerializableSingleton;

    private DoubleLockSerializableSingleton() {}

    public static DoubleLockSerializableSingleton getInstance() {
        if (doubleLockSerializableSingleton == null) {
            synchronized (DoubleLockSerializableSingleton.class) {
                if (doubleLockSerializableSingleton == null) {
                    doubleLockSerializableSingleton = new DoubleLockSerializableSingleton();
                }
            }
        }
        return doubleLockSerializableSingleton;
    }

    private Object readResolve() {
        return doubleLockSerializableSingleton;
    }
}
