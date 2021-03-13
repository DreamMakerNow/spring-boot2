package shuzu;// DATE: 2021/1/23-10:36  Happy Every Day


import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int max=0, min=0, sum=0;
        int[] arr=new int[6];
        arr[0]= max=min=random.nextInt(30)+1;
        for (int i = 1; i < 6; i++) {
            arr[i]=random.nextInt(30)+1;
            for (int j = 0; j < i; j++) {
                if (arr[i]==arr[j]){
                    i--;
                    break;
                }
                else if(arr[i]>max)
                    max=arr[i];
                else if (arr[i]<min)
                    min=arr[i];

            }
            System.out.printf("arr[%d] = %d\n",i , arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }
}
