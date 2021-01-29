package TestOOP4.src.com.msb.text08;

/**
 * 1.内部类：成员内部类(静态、非静态) 和 局部内部类（位置：方法内、块内、构造器内）
 *
 * 2.成员内部类：
 * 修饰符：public, private, default, protect, final, abstract
 */
public class TestOuter {

    class D{
        String name;
        int age = 20;
        public void method(){

            //3.内部类可以访问外部类的内容
            //a();

            int age = 30;

            //5.访问重名的方法
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(TestOuter.this.age);
        }
    }

    static class E{
    }

    int age = 10;

    public TestOuter() {
        class C{
        }
    }

    public void a(){
        System.out.println("a()");
        {
            System.out.println("普通快");
            class B{
            }
        }
        class A{
        }

        //4.外部类访问内部类
        D d = new D();
        System.out.println(d.name);
        d.method();
    }
}

class Demo{
    public static void main(String[] args) {
        TestOuter t = new TestOuter();
        t.a();

        //6.在另一个类中访问内部类
        TestOuter.D d = t.new D();
        TestOuter.E e = new TestOuter.E();
    }
}