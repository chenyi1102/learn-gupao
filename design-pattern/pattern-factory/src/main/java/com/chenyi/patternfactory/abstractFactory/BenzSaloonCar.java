package com.chenyi.patternfactory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 13:37
 * Description: No Description
 **/
public class BenzSaloonCar implements ISaloonCar{
    @Override
    public void driver() {
        System.out.println("我是奔驰家的轿车，现在开始上路了");
    }
}
