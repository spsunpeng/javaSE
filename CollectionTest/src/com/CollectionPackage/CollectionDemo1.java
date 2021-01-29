package com.CollectionPackage;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.*;

/**
 * @Auther:SunPeng
 * @Date:2020/7/28-07-28
 * @Description:CollectionPackage
 * @version:1.0
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("111");
        c.add(new Integer(333));

        Iterator i = c.iterator();           //1、定义迭代器，初始位置为-1
        while (i.hasNext()){                 //2.（p+1） == null 判断有没有下一个
            if(i.next().equals("aaa")){     //3.p++并返回*p，先++指向下一个，然后在解引用
                i.remove();                 //删除
            }

            i.next();
            /*当程序中有两个i.next()时
            1.会有两次++，程序每一循环都是+2，
            2.后一个就和前一个不一样
            3.后一个也需要先判断是否越界，i.hasNext()
            4.所以只是为了*p的使用，那么先要给出Object o = i.next(); 然后就可以反复使用o，而不用担心多次++
             */
            System.out.println(1);
            //这个循环的思想，初始为-1，再区申请++
        }
        System.out.println(c);



       /* String str1 = new String("aaa");
        String str2 = new String("aaa");

        if(str1==str2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        CTest1 c1 = new CTest1(18,"sunpeng","nan");
        CTest1 c2 = new CTest1(18,"sunpeng","nan");
        if(c1==c2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(c1.equals(c2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode()); //需要重写，不然hashCode不一样。服务于hashMap
        //相同的元素（equal）应该有相同的hashCod。所以重写equal也应该重写equal。*/
    }
}

class CTest1{
    public int age=18;
    public String name = "sunpeng";
    private String sex = "man";

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
}

/*
1.java容器不支持基本数据类型，当参数是基础数据类型时系统会自动转换为基础类型对象，所以c.add(333); = c.add(new Integer(333));
 */