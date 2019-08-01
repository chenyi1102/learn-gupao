package com.chenyi.patternsingleton.register;

import java.util.HashMap;

/**
 * @ClassName ContainerSingleton
 * @Description
 * @Author chenyi
 * @Date 2019/7/30 7:46
 **/
public class ContainerSingleton {

    private static HashMap<String, Object> instance = new HashMap<>();

    private ContainerSingleton() {
    }

    public static Object getInstance(String className) {
        synchronized (instance) {
            if (null == instance.get(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    instance.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();

                }
                return obj;
            } else {
                return instance.get(className);
            }
        }
    }


}
