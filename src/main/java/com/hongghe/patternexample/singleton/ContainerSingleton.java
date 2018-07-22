package com.hongghe.patternexample.singleton;

import javax.management.ObjectInstance;
import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 * 在程序的初始化，将多个单例类型注入到一个统一管理的类中，
 * 使用时通过key来获取对应类型的对象，这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行操作。
 *
 * @author hongghe 21/07/2018
 */
public class ContainerSingleton {

    private static Map<String, Object> objectMap = new HashMap<String, Object>();

    private ContainerSingleton() {}

    public static void registerService(String key, ObjectInstance instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService (String key) {
        return objectMap.get(key);
    }
}
