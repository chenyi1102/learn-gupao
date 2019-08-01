package com.chenyi.patternsingleton.hungry;

import java.io.Serializable;

/**
 * @ClassName HungrySingleton
 * @Description 恶汉式单例模式
 * 优点：没有加任何锁，线程安全，在执行的时候效率高
 * 缺点：在类加载的时候就会创建对象，不管用不用都占用资源
 * @Author chenyi
 * @Date 2019/7/29 22:03
 **/
public class HungrySingleton implements Serializable {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }


}
