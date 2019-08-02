package com.chenyi.patternprototype.simple;

/**
 * @ClassName SimplePrototype
 * @Description TODO
 * @Author chenyi
 * @Date 2019/8/2 7:40
 **/
public class SimplePrototype implements Cloneable {

    private String name;
    private int age;
    private String hobbies;

    public SimplePrototype(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
