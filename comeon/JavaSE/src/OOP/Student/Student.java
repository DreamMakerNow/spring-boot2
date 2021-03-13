package OOP.Student;

// DATE: 2021/1/26-20:47  Happy Every Day


import java.util.Scanner;
import java.util.Vector;

public class Student {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //创建Vector对象（一个容器） 在这里相当于数组
        Vector<Integer> v=new Vector<Integer>();
        int maxScre=0;
        while (true){
            System.out.println("请输入学生成绩：");
            int score=scanner.nextInt();
            if (score<0){
                break;
            }if (score>100){
                System.out.println("输入数据非法 请重新输入");
                continue;
            }
            v.add(score);
            if (maxScre<score){
                maxScre=score;
            }
        }
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj=v.elementAt(i); //获取每一个元素
            int score= (int) obj;
            if (maxScre - score <= 10){
                level='A';
            }else if (maxScre - score <= 20){
                level='B';
            }else if (maxScre - score <= 30){
                level='C';
            }else {
                level='D';
            }
            System.out.println("student " + i+" score is:"+score+",level is:"+level);
        }

    }
}
