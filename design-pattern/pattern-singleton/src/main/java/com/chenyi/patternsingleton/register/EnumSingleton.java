package com.chenyi.patternsingleton.register;

/**
 * @ClassName EnumSingleton
 * @Description 枚举注册式单例
 * @Author chenyi
 * @Date 2019/7/29 22:23
 **/
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }
}
