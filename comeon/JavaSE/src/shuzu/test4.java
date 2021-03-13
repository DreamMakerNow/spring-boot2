package shuzu;// DATE: 2021/1/23-12:49  Happy Every Day


import java.util.Random;
import java.util.Arrays;
public class test4 {
    private static void swap(int[] data,int i,int j){
        int temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
    private static void subSort(int[] data,int start,int end){
        if (start<end){
            int base=data[start];
            int low=start;
            int high=end+1;
            while (true){
                while (low<end && data[++low]-base <= 0)
                    ;
                while (high > start && data[--high]-base >= 0)
                    ;
                if (low < high)
                    swap(data,low,high);
                else break;
            }
            swap(data,start,high);
            subSort(data,start,high-1);//递归调用
            subSort(data,high+1,end);
        }
    }
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[6];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=random.nextInt(100)+1;
            System.out.println("arr = " + arr[i]);
        }
        //冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("*****************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
        //快速排序 重点 以后记得研究
        int[] data=new int[]{1,5,54,2,3,5,-7};
        System.out.println("排序前：\n");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
        quickSort(data);
        System.out.println("排序后：\n");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
