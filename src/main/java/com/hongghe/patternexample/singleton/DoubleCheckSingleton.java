package com.hongghe.patternexample.singleton;

/**
 * 双重检查
 *
 * 这种写法在getSingleton方法中对singleton进行了两次判空，
 * 第一次是为了不必要的同步，
 * 第二次是在singleton等于null的情况下才创建实例。
 *
 * @author hongghe 21/07/2018
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
