package com.zhaoss.test02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructor {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cls = Student.class;

        Constructor[] c1 = cls.getConstructors();
        for(Constructor c : c1){
            System.out.println(c);
        }

        Constructor[] c2 = cls.getDeclaredConstructors();
        for(Constructor c : c2){
            System.out.println(c);
        }

        System.out.println("==============================");
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);

        //Constructor con2 = cls.getConstructor(int.class, double.class);//找不到会报错
        //System.out.println(con2);

        Constructor con3 = cls.getDeclaredConstructor();
        System.out.println(con3);

        Constructor con4 = cls.getDeclaredConstructor(int.class, double.class);
        System.out.println(con4);

        System.out.println("===============================================");

        Object o1 = con1.newInstance();
        System.out.println(o1);

        //默认无参构造器的快捷使用
        Object o = cls.newInstance();
        System.out.println(o);

    }
}
