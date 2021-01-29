package com.CollectionPackage2;

import java.util.*;

/**
 * @Auther:SunPeng
 * @Date:2020/7/28-07-28
 * @Description:CollectionPackage2
 * @version:1.0
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add(new CTest1(18,"sunpeng","nan"));
        c.add(new CTest1(20,"sunyue","nv"));
        c.add(new CTest1(10,"sunyue","nv"));
        c.add(new CTest1(40,"spgg","nm"));
        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);

        Collection c1 = new ArrayList();
        c1.add(20); //自动打包
        Integer A = new Integer(10);
        int a = A; //自动解包
    }
}


class CTest1 implements Comparable<CTest1>{
    public int age;
    public String name = "sunpeng";
    private String sex = "man";

    @Override
    public int compareTo(CTest1 c) {
        int res = 0;
        if (age<c.age){
            res = -1;
        }else if(age>c.age){
            res = 1;
        }
        return res;
    }

    /*@Override
    public int compareTo(Comparable<CTest1> o) {
        int res = 0;
        if (age<c.age){
            res = -1;
        }else if(age>c.age){
            res = 1;
        }
        return res;
    }*/

    public CTest1(){
    }

    public CTest1(int age, String name, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CTest1 cTest1 = (CTest1) o;
        return age == cTest1.age &&
                Objects.equals(name, cTest1.name) &&
                Objects.equals(sex, cTest1.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sex);
    }

    @Override
    public String toString() {
        return "CTest1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
