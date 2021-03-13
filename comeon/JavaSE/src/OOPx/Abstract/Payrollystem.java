package OOPx.Abstract;

// DATE: 2021/1/28-14:38  Happy Every Day


import java.util.Calendar;

public class Payrollystem {
    public static void main(String[] args) {
//        //手动输入月份
//        System.out.println("请输入当前月份：");
//        Scanner scanner=new Scanner(System.in);
//        int month=scanner.nextInt();
        //获取系统当前时间
        Calendar calendar=Calendar.getInstance();
        int month=calendar.get(Calendar.MONTH)+1;
        Employ arr[]=new Employ[2];//  Employ[] arr1=new Employ[10];
        arr[0]=new SalariedEmployee("Tom",1001,new MyDate(1999,3,15),10002);
        arr[1]=new HourlyEmployee("Lisa",1002,new MyDate(1865,1,27),100,10);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i].getBirthday().getMonth()==month) {
                System.out.print("当月工资为：" + (arr[i].earning() + 100));
                System.out.println("  本月是你的生日 奖励你100美元");
            }
            else System.out.println("当月工资为："+arr[i].earning());
        }
        System.out.println("month = " + month);
    }
}
