package com.chenyi.patternsingleton.lazy;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @ClassName InnerClassSingleton
 * @Description
 * @Author chenyi
 * @Date 2019/7/29 22:16
 **/
public class InnerClassSingleton {

    private InnerClassSingleton() {
        //防止通过放射暴力获取对象
        if (null != Inner.innerClassSingleton) {
            throw new RuntimeException("请勿重复初始化");
        }
    }

    public static InnerClassSingleton getInstance() {
        return Inner.innerClassSingleton;
    }

    private static class Inner {
        public static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

}
