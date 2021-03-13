package base;// DATE: 2021/1/18-21:26  Happy Every Day

import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        String str=scanner.next();
        System.out.println("num = " + num);
        System.out.println("str = " + str);

        double value=Math.random()*100;//[0.0~1.0)
        System.out.println("value = " + value);

        int a=1;
        label:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a+++"\t");
                break label;//打破带标签的循环
            }
            System.out.println(" ");
        }
    }
}
