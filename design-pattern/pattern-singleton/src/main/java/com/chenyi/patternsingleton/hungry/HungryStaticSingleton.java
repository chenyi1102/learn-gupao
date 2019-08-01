package com.chenyi.patternsingleton.hungry;

/**
 * @ClassName HungryStaticSingleton
 * @Description TODO
 * @Author chenyi
 * @Date 2019/7/29 22:05
 **/
public class HungryStaticSingleton {

    private static HungryStaticSingleton hungryStaticSingleton;

    private HungryStaticSingleton(){}

    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }

}
