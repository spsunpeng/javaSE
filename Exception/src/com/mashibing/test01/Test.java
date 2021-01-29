package com.mashibing.test01;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("please enter num1: ");
            int num1 = scanner.nextInt();
            System.out.print("please enter num2: ");
            int num2 = scanner.nextInt();

            System.out.println(num1/num2);
        } catch (Exception e){

            //1.什么都不做

            //2.为用户打印信息
            System.out.println("出现异常");

            //3.为程序员打印详细信息
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

            //4.抛出
            throw e;

        }



        System.out.println("thinks");


    }


}
