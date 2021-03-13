package Thread;

// DATE: 2021/2/1-11:04  Happy Every Day


public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
//        myThread1.start();
//        myThread2.start();
        //创建匿名子类方式的两种方法
        new MyThread1().start();
        new MyThread2().start();
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 1; i < 101; i++) {
//                    if (i%2!=0)
//                        System.out.println(1+" : "+i);
//                }
//            }
//        }.start();
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 1; i < 101; i++) {
//                    if (i%2==0)
//                        System.out.println(0+" : "+i);
//                }
//            }
//        }.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i%2!=0)
                System.out.println(1+" : "+i);
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i%2==0)
                System.out.println(0+" : "+i);
        }
    }
}
