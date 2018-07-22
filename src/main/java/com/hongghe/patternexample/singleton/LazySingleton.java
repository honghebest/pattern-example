package com.hongghe.patternexample.singleton;

/**
 * 懒汉式,线程不安全
 *
 * 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，虽然节约了资源，但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
 *
 * @author hongghe 07/2018
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public LazySingleton getInstance() {
        if (lazySingleton == null) {
            return new LazySingleton();
        }
        return lazySingleton;
    }
}
