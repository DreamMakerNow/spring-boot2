package shuzu;// DATE: 2021/1/19-12:08  Happy Every Day


public class demo3 {
    public static void main(String[] args) {
        int[] ids;//声明
        //静态初始化(初始化和元素的赋值同时进行)
        ids=new int[]{1,2,3,4,5,6};//int[] ids={1,2,3,4,5,6};
        //错误示范 ids=new int[2]{1,2};
        //动态初始化(初始化和元素的赋值分开进行)
        String[] names=new String[5];
        int length=names.length;
        int a=1;
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
          System.out.println("names[i] = " + names[i]);
        }
        for (int i = 0; i < ids.length; i++) {
            System.out.println("ids[i] = " + ids[i]);
        }
        //二维数组


        int[][] arr1= new int[][]{};
        int[][] arr2= new int[3][2];
        System.out.println("arr2 = " + arr2[1][1]);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("arr2 = " + arr2[i][j]);
            }
        }
    }
}
