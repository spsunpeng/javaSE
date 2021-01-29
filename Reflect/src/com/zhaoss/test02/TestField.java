package com.zhaoss.test02;

import java.lang.reflect.Field;

public class TestField {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class cls = Student.class;

        Field[] f1 = cls.getFields();
        for(Field f : f1){
            System.out.println(f);
        }

        System.out.println();

        Field[] f2 = cls.getDeclaredFields();
        for(Field f : f2){
            System.out.println(f);
        }

        System.out.println("+++++++++++++=============================");
        Field score = cls.getField("score");
        System.out.println(score);
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);

        System.out.println("+++++++++++++=============================");
        String name = score.getName();
        System.out.println(name);

        System.out.println("+++++++++++++=============================");
        Object o = cls.newInstance();
        score.set(o, 20);
        System.out.println(o);
    }


}
