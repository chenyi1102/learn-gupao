package com.chenyi.patternsingleton.test;

import com.chenyi.patternsingleton.hungry.HungrySingleton;
import com.chenyi.patternsingleton.lazy.DoubleCheckSingleton;
import com.chenyi.patternsingleton.lazy.InnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/30 11:31
 * Description: 反射破坏单例模式
 **/
public class ReflectDestoryTest {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = HungrySingleton.class;

        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        Object o1 = constructor.newInstance();
        Object o2 = constructor.newInstance();

        System.out.println(o1==o2);

    }


}
