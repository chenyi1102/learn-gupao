package com.chenyi.patternfactory.abstractFactory;

import com.chenyi.patternfactory.BenzSportSportCar;
import com.chenyi.patternfactory.ISportCar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 13:24
 * Description: No Description
 **/
public class BenzCarFactory implements ICarFactory{

    @Override
    public ISportCar creatSportCar() {
        return new BenzSportSportCar();
    }

    @Override
    public ISaloonCar creatSaloonCar() {
        return new BenzSaloonCar();
    }

}
