package com.chenyi.patternfactory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 13:38
 * Description: No Description
 **/
public class AudiSaloonCar implements ISaloonCar {
    @Override
    public void driver() {
        System.out.println("我是奥迪家的轿车，我现在出门上路了");
    }
}
