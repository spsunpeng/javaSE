package TestOOP4.src.com.msb.text12;

import java.util.Arrays;

/**
 * @Auther:SunPeng
 * @Date:2020/7/24-07-24
 * @Description:com.msb.text12
 * @version:1.0
 */
class mTest{
    public static void main(String[] args){
        int[] arr = {54,2,5,76,12};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,5));

        int[] arr2 = {5,46,12,45};
        int[] newarr = Arrays.copyOf(arr2,arr2.length);
        arr2[0] = 0;
        System.out.println(Arrays.toString(newarr));

        Arrays.fill(arr2,10);
        System.out.println(Arrays.toString(arr2));

        int[] src = {15,16,12,45,5 , 13,15,46,42};
        int[] des = new int[10];
        System.arraycopy(src,1, des,2,4);
        System.out.println(Arrays.toString(des));
    }
}
/**
 * 工具Array：扩展数组的功能
 * tostring(Array)             配合打印使用
 * sort(Array)                 排序
 * binarySearch(Array,value)   输出pos
 * copyOf(Array,length)        完整复制
 * copyOfRange(Array, left, right):区间复制，左闭右开
 * 左闭右开，完整复制认为左为0， 补充数组的=，只能引用
 * equals                     判断数组内的值相等不，补足==
 * fill(Array,value)          数组全部填充为value
 */
