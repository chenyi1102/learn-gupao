package com.chenyi.patternsingleton.test;

import com.chenyi.patternsingleton.hungry.HungrySingleton;
import com.chenyi.patternsingleton.lazy.DoubleCheckSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: wanghan
 * Date: 2019/7/30 13:14
 * Description: 序列化破坏单例
 **/
public class SeriableDestoryTest {

    public static void main(String[] args) {
        DoubleCheckSingleton s1 = null;
        DoubleCheckSingleton s2 = DoubleCheckSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("seriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("seriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1  = (DoubleCheckSingleton) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
