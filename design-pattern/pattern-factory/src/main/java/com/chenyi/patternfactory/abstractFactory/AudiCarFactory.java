package com.chenyi.patternfactory.abstractFactory;

import com.chenyi.patternfactory.AudiSportSportCar;
import com.chenyi.patternfactory.ISportCar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 13:24
 * Description: No Description
 **/
public class AudiCarFactory implements ICarFactory{

    @Override
    public ISportCar creatSportCar() {
        return new AudiSportSportCar();
    }

    @Override
    public ISaloonCar creatSaloonCar() {
        return new AudiSaloonCar();
    }
}
