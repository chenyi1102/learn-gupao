package com.chenyi.patternsingleton.lazy;

/**
 * @ClassName SimpleLazySingleton
 * @Description
 * @Author chenyi
 * @Date 2019/7/29 22:08
 **/
public class SimpleLazySingleton {

    private SimpleLazySingleton(){}

    private static SimpleLazySingleton simpleLazySingleton;

    public synchronized static SimpleLazySingleton getInstance(){
        if (null == simpleLazySingleton) {
            simpleLazySingleton = new SimpleLazySingleton();
        }
        return simpleLazySingleton;
    }


}
