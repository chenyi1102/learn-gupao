package com.chenyi.patternsingleton.test;

import com.chenyi.patternsingleton.threadLocal.ThreadLocalSingleton;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/30 18:10
 * Description: No Description
 **/
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        System.out.println( ThreadLocalSingleton.getInstance());
        System.out.println( ThreadLocalSingleton.getInstance());
        System.out.println( ThreadLocalSingleton.getInstance());
        System.out.println( ThreadLocalSingleton.getInstance());
    }
}
