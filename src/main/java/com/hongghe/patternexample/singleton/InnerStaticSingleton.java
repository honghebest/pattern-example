package com.hongghe.patternexample.singleton;

/**
 * 静态内部类单例模式
 *
 * 第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，
 * 这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 *
 * @author hongghe 21/07/2018
 */
public class InnerStaticSingleton {

    private InnerStaticSingleton() {}

    private static class SingletonHolder {
        private static final InnerStaticSingleton innerStaticSingleton = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInnerStaticSingleton() {
        return SingletonHolder.innerStaticSingleton;
    }
}
