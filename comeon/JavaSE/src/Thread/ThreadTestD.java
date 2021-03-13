package Thread;

// DATE: 2021/2/1-13:42  Happy Every Day
/*
    多线程的创建方法 2：实现 runable 接口；
        1、创建一个类去实现runable接口
        2、实现类去实现runable接口中的抽象方法 run()
        3、创建实现类的对象
        4、将此对象作为参数传递到Thread类的构造器中，创建 Thread类对象
        5、通过 Thread 类对象启动线程 start()

 */

public class ThreadTestD {
    public static void main(String[] args) {
        MThread mThread=new MThread();
        Thread thread=new Thread(mThread);//----------> 调用了Runable 类型的target的 run() 方法
        thread.start();
        new Thread(mThread){
            @Override
            public void run() {
                for (int i = 1; i < 101; i++) {
                    if (i%2!=0)
                        System.out.println(Thread.currentThread().getName()+" : "+i);
                }
            }
        }.start();
    }
}
class MThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i%2==0)
                System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
