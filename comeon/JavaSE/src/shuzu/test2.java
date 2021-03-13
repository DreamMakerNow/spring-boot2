package shuzu;// DATE: 2021/1/23-11:16  Happy Every Day


import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1=new int[]{2,3,5,7,11,13,17,19};
        for (int j : arr1) {
            System.out.print(j + "\t");
        }
        arr2=arr1;
        System.out.println();
        for (int i = 0; i < arr2.length; i+=2) {
            arr2[i]=i;
        }
        for (int j : arr2) {
            System.out.print(j + "\t");
        }
        System.out.println();
        int[] arr3=new int[]{1,2,3,};
        System.out.println("arr3 = " + Arrays.toString(arr3));
        char[] arr4= new char[]{'a','b','c'};
        System.out.println("arr4 = " + Arrays.toString(arr4));
    }
}
