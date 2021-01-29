package TestOOP4.src.com.msb.text11;

import java.util.Arrays;

/**
 * @Auther:SunPeng
 * @Date:2020/7/24-07-24
 * @Description:com.msb.text11
 * @version:1.0
 */
class CTest1{
    public int age=18;
    public String name = "sunpeng";
    private String sex = "man";

    public CTest1(){
    }

    public CTest1(int age, String name, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {
        int a = 10;
        int[] arr = new int[4];

        for(int i=1; i<100; i++) {
            a+=1;
        }

        test();

        Arrays.toString(arr);
    }

    public static void test(){
        System.out.println(10);
    }

}
