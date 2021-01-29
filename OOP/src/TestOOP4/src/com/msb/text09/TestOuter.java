package TestOOP4.src.com.msb.text09;

public class TestOuter {

    public void method(){
        int num = 10;
        class A{
            public void a(){
                //num = 20;   //1.局部变量对于局部内部类而言是final
                System.out.println(num);
            }
        }
    }

    //2.如果类在整个项目中只是用一次，那么没有必要单独创造出一个类，此时，创造内部类就比较好
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 100;
            }
        }

        return new B();
    }

    public Comparable method3(){
        //3.匿名内部类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
    }

}

/*
class Test{
    public static void main(String[] args) {
        TestOuter t = new TestOuter();
        t.method();
    }
}
 */
