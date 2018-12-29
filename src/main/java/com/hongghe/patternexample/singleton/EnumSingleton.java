package com.hongghe.patternexample.singleton;

import java.io.ObjectStreamException;

/**
 * 枚举单例
 *
 * 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例，上述讲的几种单例模式实现中，
 * 有一种情况下他们会重新创建对象，那就是反序列化，将一个单例实例对象写到磁盘再读回来，
 * 从而获得了一个实例。反序列化操作提供了readResolve方法，这个方法可以让开发人员控制对象的反序列化。
 *
 * @author hongghe 21/07/2018
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {}

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
