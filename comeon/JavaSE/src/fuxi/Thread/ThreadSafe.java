package fuxi.Thread;

// DATE: 2021/2/23-11:03  Happy Every Day


import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafe {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        Thread t1 = new Thread(myLock);
        Thread t2 = new Thread(myLock);
        Thread t3 = new Thread(myLock);
        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyLock implements Runnable{
    private int ticket=100;
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             {
                 lock.lock();
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName() + " : 卖票,票号为：" + ticket--);
                }else {
                    System.out.println(Thread.currentThread().getName()+"票已经售完");
                    break;
                }
                lock.unlock();
            }
        }
    }
}
