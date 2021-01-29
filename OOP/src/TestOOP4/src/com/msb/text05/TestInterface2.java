package TestOOP4.src.com.msb.text05;

public interface TestInterface2 {
    //常量
    public static final int NUM=10;
    //抽象方法
    public abstract void a();
    //非抽象方法
    public default void b(){
        System.out.println("b()");
    }
    //静态方法
    public static void c() {
        System.out.println("c()");
    }
}

class Demo implements TestInterface2 {
    @Override
    public void a() {
        System.out.println("a()");
        System.out.printf("==");
    }

    public static void c() {
        System.out.println("Demo.c()");
    }
}


class A{
    public static void main(String[] args) {
        TestInterface2.c();
        Demo.c();
    }
}

/**
 * 问：问什么接口中加入非抽象方法？
 * 答：因为如果修改接口，对实现接口的类们影响太大。
 */

