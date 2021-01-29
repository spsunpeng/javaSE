package com.mashibing;



public class test2 {

    public static void main(String[] args) {

        //父类
        java.util.Date dateUtil = new java.util.Date();
        System.out.println(dateUtil);

        //子类，java.sql.Date必须是有参构造
        java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());
        System.out.println(dateSql);

        //子类转父类，猴子是动物
        dateUtil = dateSql;

        //父类一般不能转子类，动物是猴子，除非多态

    }




}
