package shuzu;// DATE: 2021/1/23-11:28  Happy Every Day


public class test3 {
    public static void main(String[] args) {
        String[] arr=new String[]{"JJ","DD","MM","BB","GG","AA","XX"};
        //字符型复制不同于int[]
        String[] arr1=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
//            System.out.println(arr1[i]);
        }
        //数组反转
        for (int i = 0; i < arr.length/2; i++) {
            String tmp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //查找
        //线性查找
        String dest="B";
        boolean isFlag=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==dest) {
                isFlag=false;
                System.out.println("查找成功，下标为" + i);
                break;
            }
        }
        if (isFlag)
            System.out.println("没有找到NULL");
        //二分法查找（必须是有序数组）
        int[] arr2=new int[]{-84,-52,-2,48,59,85,162,1111,3325};
        int dest1=-52;
        int hend=0;
        int end=arr2.length-1;
        boolean isFlag1=true;
        while (hend<=end){
            int middle=(hend+end)/2;
            if (dest1==arr2[middle]){
                isFlag1=false;
                System.out.println("查找成功，下标为" + middle);
                break;
            }else if(arr2[middle]>dest1){
                end=middle-1;
            }
            else
                hend=middle+1;
        }
        if (isFlag1)
            System.out.println("没有找到NULL");
    }
}
