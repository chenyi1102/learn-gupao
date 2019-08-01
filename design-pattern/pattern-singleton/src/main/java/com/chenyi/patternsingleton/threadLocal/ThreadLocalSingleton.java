package com.chenyi.patternsingleton.threadLocal;

import java.util.Map;

/**
 * @ClassName ThreadLocalSingleton
 * @Description 线程级别的单例
 * @Author chenyi
 * @Date 2019/7/30 8:06
 **/
public class ThreadLocalSingleton {

    private ThreadLocalSingleton (){}

    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }


}
