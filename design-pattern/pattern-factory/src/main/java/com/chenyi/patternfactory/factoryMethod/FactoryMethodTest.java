package com.chenyi.patternfactory.factoryMethod;

import com.chenyi.patternfactory.ISportCar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 11:30
 * Description: 工厂方法
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICarFactory audiCarFactory = new AudiCarFactory();
        ISportCar audiSportCar =  audiCarFactory.creatSportCar();
        audiSportCar.driver();

        ICarFactory benzCarFactory = new BenzCarFactory();
        ISportCar benzSportCar = benzCarFactory.creatSportCar();
        benzSportCar.driver();
    }
}
