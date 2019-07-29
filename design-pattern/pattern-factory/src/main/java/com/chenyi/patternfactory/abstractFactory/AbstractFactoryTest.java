package com.chenyi.patternfactory.abstractFactory;

import com.chenyi.patternfactory.ISportCar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 13:40
 * Description: No Description
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICarFactory audiCarFactory = new AudiCarFactory();
        ISportCar audiSportCar =  audiCarFactory.creatSportCar();
        audiCarFactory.creatSaloonCar().driver();
        audiSportCar.driver();

        ICarFactory benzCarFactory = new BenzCarFactory();
        ISportCar benzSportCar = benzCarFactory.creatSportCar();
        benzCarFactory.creatSaloonCar().driver();
        benzSportCar.driver();
    }
}
