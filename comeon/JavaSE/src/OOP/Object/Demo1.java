package OOP.Object;

import java.util.Arrays;
import java.util.Objects;

// DATE: 2021/1/26-14:41  Happy Every Day
/*
    一：== 运算符
        1、可以使用在基本数据类型变量中
        2、比较的是地址值
    二：equals()方法
        1、object类中等于 ==

    在自定义中如果想用equals比较地址值 需要对 object 中的方法进行重写
 */
// object 中常见的方法
public class Demo1 {


    public static void main(String[] args) {
        int a = 10, b = 10;
        double x = 10.0;
        String c = "haha";
        String d = "haha";
        String e = "10";
        //char f='10';
        String[] arr = new String[]{"hello"};
        String[] arr1 = new String[]{"hello"};
        System.out.println(a == b);//true
        System.out.println(b == x);//true
        System.out.println(c == d);//true
        //System.out.println(b==e);
        System.out.println(arr == arr1);//false
        //System.out.println(arr.equals(arr1));

    }

}

