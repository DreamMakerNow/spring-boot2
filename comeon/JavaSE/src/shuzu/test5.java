package shuzu;// DATE: 2021/1/23-13:47  Happy Every Day

//Arrays工具类的使用，数组工具类
import java.util.Arrays;
public class test5 {

    public static void main(String[] args) {
        // boolean equals(int[] a,int[] b) 判相等
        int[] arr1=new  int[]{1,2,3,4,5};
        int[] arr2=new  int[]{1,2,3,5,4};

        boolean isFlag=Arrays.equals(arr1,arr2);
        System.out.println("isFlag = " + isFlag);

        // String toString(int[] a) 转成字符串
        String s=Arrays.toString(arr1);
        System.out.println("s = " + s);

        // fill(int[] a,int b) 向指定数组添加数值 会将数组中所有数值都替换
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        // void sort(int[] ) 直接调用排序
        int[] arr=new int[]{1,5,2,3,48,9,-5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        // int binarySearch(int[] a,int key) 二分查找
       int index= Arrays.binarySearch(arr,0);// 返回值为负数 则未找到
        System.out.println("index = " + index);
        test4.quickSort(arr);

    }
}
