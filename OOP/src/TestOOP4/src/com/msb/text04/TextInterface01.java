package TestOOP4.src.com.msb.text04;

/**
 * 1.类是类，接口是接口，他们是同一层次的概念
 * 2.接口没有构造器
 * 3.接口如何声明：interface
 * 4.在JDK1.8之前，接口只有两部分内容
 * （1）常量：固定的修饰符：public static final
 * （2）抽象方法：固定修饰符：public abstract
 */

public interface TextInterface01 {
    public static final int NUM = 10;

    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String name);
}

interface TextInterface02{
    void e();
    void f();
}

/**
 * 5.类与接口的关系？类和接口的实现关系，类实现接口
 * 6.一旦实现一个接口，那么实现类要实现接口的所有抽象方法。
 * 7。如果没有全部实现抽象方法，那么可以定义为抽象类
 * 8.java只有单继承，可以有多实现
 * 9.写法：先继承再实现
 */
 class Student extends Person implements TextInterface01,TextInterface02{

    public void a(){
        System.out.println("---1");
    }

    public void b(int num){
        System.out.println("---2");
    }

    public int c(String name){
        return 100;
    }

    public void e(){
    }

    public void f(){}
}

class textClass {
    public static void fun1(TextInterface01 t) {
        t.a();
    }

    public TextInterface01 fun2() {
        Student s = new Student();
        return s;
    }
}

class Text{

    public static void main(String[] args){

        //10.接口不能定义对象
        //TextInterface01 t = new TextInterface01();

        TextInterface01 t = new Student();
        t.a();

        Student s = new Student();
        textClass.fun1(s);

        //11：访问接口中的常量
        System.out.println(s.NUM);
        System.out.println(t.NUM);
        System.out.println(Student.NUM);
        System.out.println(TextInterface01.NUM);
    }
 }

/**
 * 继承：手机 extends 照相机 “is-a” 手机是一个照相机
 * 实现：手机 implements 拍摄功能“has-a” 手机具有拍摄功能
 *
 *  多态的应用场合：
 *  （1）㺑当作方法的形参，传入具体的子类对象
 *  （2）父类当作方法的返回值，返回的是具体的子类的对象
 *
 *  (1)接口当作方法的形参，传入具体实现类的对象
 * （2）接口作为方法的返回值，返回的是具体实现类的对象
 */









