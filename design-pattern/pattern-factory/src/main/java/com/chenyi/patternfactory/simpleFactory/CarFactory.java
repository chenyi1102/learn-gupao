package com.chenyi.patternfactory.simpleFactory;

import com.chenyi.patternfactory.ISportCar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 11:16
 * Description: No Description
 **/
public class CarFactory {
    public static ISportCar create(Class<?> clazz) {
        try {
            if (null != clazz) {
                return (ISportCar) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
