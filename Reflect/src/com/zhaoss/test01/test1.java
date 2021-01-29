package com.zhaoss.test01;

import com.zhaoss.test01.pay.AliPay;
import com.zhaoss.test01.pay.BankCard;
import com.zhaoss.test01.pay.Mtwm;
import com.zhaoss.test01.pay.WeChat;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class test1 {
    public static void main(String[] args) {
        String str = "WeChat";

        proxyPay1(str);
        proxyPay2(str);
        try {
            proxyPay3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //一般处理
    public static void proxyPay1(String str){
        if(str.equals("WeChat")){
            WeChat WeChat = new WeChat();
            WeChat.payOnline();
        }else if(str.equals("AliPay")){
            AliPay aliPay = new AliPay();
            aliPay.payOnline();
        }else if(str.equals("BankCard")){
            BankCard bankCard = new BankCard();
            bankCard.payOnline();
        }
    }

    //多态
    public static void proxyPay2(String str){
        if(str.equals("WeChat")){
            WeChat WeChat = new WeChat();
            payOnlineMethod(WeChat);
        }else if(str.equals("AliPay")){
            AliPay aliPay = new AliPay();
            payOnlineMethod(aliPay);
        }else if(str.equals("BankCard")){
            BankCard bankCard = new BankCard();
            payOnlineMethod(bankCard);
        }
    }
    public static void payOnlineMethod(Mtwm mtwm){
        mtwm.payOnline();
    }

    //反射
    public static void proxyPay3() throws Exception{
        Class cls = Class.forName("com.zhaoss.test01.pay.WeChat");
        Object o = cls.newInstance();
        Method method = cls.getMethod("payOnline");
        method.invoke(o);
    }
}
