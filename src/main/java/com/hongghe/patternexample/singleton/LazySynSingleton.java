package com.hongghe.patternexample.singleton;


/**
 * 懒汉式，线程安全
 *
 * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，
 * 造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 *
 * @author hongghe 21/07/2018
 */
public class LazySynSingleton {

    private static LazySynSingleton lazySynSingleton;

    private LazySynSingleton() {}

    public static synchronized LazySynSingleton  getLazySynSingleton() {
        if (lazySynSingleton == null) {
            return new LazySynSingleton();
        }
        
        return lazySynSingleton;
    }
}
