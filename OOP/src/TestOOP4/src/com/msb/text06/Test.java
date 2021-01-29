package TestOOP4.src.com.msb.text06;

import java.security.Principal;

public class Test {

    public void fun(int[] arr) {
        for (int i=0; i<3; ++i)
            arr[i]+=10;
    }

    public void fun1(int a) {
        a+=100;
    }

    public void Printf(int[] arr) {
        for (int i=0; i<3; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        Test t = new Test();

        t.fun(arr);
        t.Printf(arr);

        int a=1;
        t.fun1(a);
        System.out.println(a);
    }
}
