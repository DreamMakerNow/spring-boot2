package DeadLock;

// DATE: 2021/2/1-19:38  Happy Every Day
/*
    解决线程安全的第三种方法 lock

 */

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    public static void main(String[] args) {
        Windows1 windows1 = new Windows1();
        Thread t1=new Thread(windows1);
        Thread t2=new Thread(windows1);
        Thread t3=new Thread(windows1);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

}
class Windows1 implements Runnable {
    private int ticates = 100;
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {


            try {
                lock.lock();
                if (ticates > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " : 卖票,票号为：" + ticates);
                    ticates--;
                } else {
                    System.out.println(Thread.currentThread().getName() + "票已经卖完");
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

