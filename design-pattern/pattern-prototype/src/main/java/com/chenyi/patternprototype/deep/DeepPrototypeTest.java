package com.chenyi.patternprototype.deep;

import java.util.ArrayList;

/**
 * @ClassName DeepPrototypeTest
 * @Description TODO
 * @Author chenyi
 * @Date 2019/8/2 7:57
 **/
public class DeepPrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //深克隆
        DeepPrototype deepPrototypeA = new DeepPrototype("302", "合肥", new ArrayList<>());
        DeepPrototype deepPrototypeB = (DeepPrototype) deepPrototypeA.clone();
        System.out.println("深克隆：" + deepPrototypeA.getClassGrade() == deepPrototypeB.getClassGrade());
        System.out.println("深克隆：" + (deepPrototypeA.getStudents() == deepPrototypeB.getStudents()));

        //浅克隆
        DeepPrototype deepPrototypeC = (DeepPrototype) deepPrototypeA.shallowClone();
        System.out.println("浅克隆：" + deepPrototypeA.getClassGrade() == deepPrototypeC.getClassGrade());
        System.out.println("浅克隆：" + (deepPrototypeA.getStudents() == deepPrototypeC.getStudents()));
    }


}
