package com.chenyi.patternprototype.simple;

/**
 * @ClassName SimplePrototypeTest
 * @Description TODO
 * @Author chenyi
 * @Date 2019/8/2 7:45
 **/
public class SimplePrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        SimplePrototype simplePrototypeA = new SimplePrototype("chenyi", 24, "运动");
        SimplePrototype simplePrototypeB = (SimplePrototype) simplePrototypeA.clone();
        System.out.println(simplePrototypeA.toString());
        System.out.println(simplePrototypeB.toString());
        System.out.println(simplePrototypeA.getHobbies() == simplePrototypeB.getHobbies());
    }

}
