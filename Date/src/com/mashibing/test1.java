package com.mashibing;

import sun.font.FontRunIterator;

import java.util.Date;

public class test1 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getTime());

        //源码中不是接口，也不是虚函数，为什么没有实现？ 答：实现可能是C写的
       System.out.println(System.currentTimeMillis());

       //用途
        long timestart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long timeend = System.currentTimeMillis();

        System.out.println(timeend-timestart);
    }




}
