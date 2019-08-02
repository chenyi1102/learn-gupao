package com.chenyi.patternprototype.deep;

import com.chenyi.patternprototype.simple.SimplePrototype;

import java.io.*;
import java.util.List;

/**
 * @ClassName DeepPrototype
 * @Description 深度克隆
 * @Author chenyi
 * @Date 2019/8/2 7:49
 **/
public class DeepPrototype implements Cloneable , Serializable {

    private String classGrade;

    private String school;

    private List<SimplePrototype> students;

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<SimplePrototype> getStudents() {
        return students;
    }

    public void setStudents(List<SimplePrototype> students) {
        this.students = students;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
           return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object shallowClone(){
        return new DeepPrototype(this.classGrade,this.school,this.students);
    }

    public DeepPrototype(String classGrade, String school, List<SimplePrototype> students) {
        this.classGrade = classGrade;
        this.school = school;
        this.students = students;
    }
}
