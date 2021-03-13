package Thread;

// DATE: 2021/2/1-10:46  Happy Every Day
/*
    多线程的创建 方式一
        1、创建一个子类继承 Thread 类
        2、重写 Thread 类中的 run 方法-----> 这里面也是需要的具体操作
        3、创建 Thread 子类的对象
        4、通过此对象调用 start() 方法
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();// 1、调用当前线程的 run 方法。2、启动此线程
       // myThread.run();//这样只是调用 run 方法，一直在主线程中运行，没有开启新的线程
        //下面的方法仍在主线程中
        //myThread.start(); //同一个对象只能启动一次线程
        MyThread myThread1=new MyThread();
        myThread1.start();
        for (int i = 0; i < 101; i++) {
            if (i%2==0)
                System.out.println(i+"主线程");
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
