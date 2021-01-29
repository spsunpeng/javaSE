package com.mashibing;

import com.mashibing.util.DateUtil;

import java.util.Date;

public class test3 {

    public static void main(String[] args) {

        String str = "2015-11-25 10:15:20";
        System.out.println(DateUtil.stringToDate(str));

        Date date = new Date();
        System.out.println(DateUtil.DateToString(date));
    }
}
