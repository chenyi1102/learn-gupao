package com.chenyi.patternfactory.simpleFactory;

import com.chenyi.patternfactory.AudiSportSportCar;
import com.chenyi.patternfactory.BenzSportSportCar;
import com.chenyi.patternfactory.ISportCar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/29 11:27
 * Description: No Description
 **/
public class SimpleFactoryTest {

    public static void main(String[] args) {
        ISportCar benzCar = CarFactory.create(BenzSportSportCar.class);
        ISportCar audiSportCar = CarFactory.create(AudiSportSportCar.class);
        benzCar.driver();
        audiSportCar.driver();
    }

}
