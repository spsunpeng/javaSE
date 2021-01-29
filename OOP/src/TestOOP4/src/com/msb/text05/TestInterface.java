package TestOOP4.src.com.msb.text05;

public interface TestInterface {

    public static final int NUM = 10;

    public abstract void a();

    public default void b(){
        System.out.println("default");
    }
}

class Test implements TestInterface{

    public void c(){
        b();
        TestInterface.super.b();
    }

    public void a(){}

    public void b(){
        System.out.println("重写了b");
    }
}

