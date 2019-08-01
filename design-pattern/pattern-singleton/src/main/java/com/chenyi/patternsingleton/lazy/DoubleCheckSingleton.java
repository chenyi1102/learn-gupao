package com.chenyi.patternsingleton.lazy;

import java.io.Serializable;

/**
 * @ClassName DoubleCheckSingleton
 * @Description 双重锁式单例（懒加载）
 * 优点：在使用时
 * @Author chenyi
 * @Date 2019/7/29 22:11
 **/
public class DoubleCheckSingleton implements Serializable {

    //增减volatile防止重排序
    private volatile static DoubleCheckSingleton doubleCheckSingleton;

    //增加条件判断是否被实例化，避免被反射破坏单例
    private static boolean flag = false;

    private DoubleCheckSingleton() {
        synchronized (DoubleCheckSingleton.class) {
            if (flag == false) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式被侵犯！");
            }
        }
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == doubleCheckSingleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == doubleCheckSingleton) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

    //用于防止序列化破坏单例
    private Object readResolve() {
        System.out.println("readReaolve");
        return doubleCheckSingleton;
    }
}
