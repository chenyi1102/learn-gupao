package com.chenyi.patternsingleton.test;

import com.chenyi.patternsingleton.threadLocal.ThreadLocalSingleton;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/30 18:17
 * Description: No Description
 **/
public class ThreadLocalTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        new Thread(new ExectorThread()).start();
        new Thread(new ExectorThread()).start();
    }
}
