package TestOOP4.src.com.msb.text07;

import com.msb.text05.TestInterface;

public class Test {

    //属性
    int a;
    static int sa;

    //方法
    public void A() {
        System.out.println("A()");
        {
            System.out.println("普通块"); //普通块
        }
    }
    public static void B(){
        System.out.printf("B()");
    }

    //构造快
    {
        System.out.println("构造块");
    }

    //构造器
    public Test(int a) {
        this.a=a;
        System.out.println("构造器");
    }

    static {
        System.out.println("静态块");
    }

    //代码块
    public static void main(String[] args) {
        Test t = new Test(1);
    }
}
/**
 * 类：属性、方法、构造器、代码块、内部类
 * 代码块：普通块、构造块、静态块
 *
 * 构造对象是代码执行顺序：
 * 静态块：只在类加载时执行一次，一般用于全局性的初始化操作，如数据库的初始信息，网络的初始信息
 * 构造块：不常用
 * 构造器
 */
