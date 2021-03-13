package fuxi.Thread;

// DATE: 2021/2/23-11:29  Happy Every Day


import java.util.concurrent.locks.ReentrantLock;

public class ThreadMethod {
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();
        Thread t1 = new Thread(myMethod);
        Thread t2 = new Thread(myMethod);
        t1.setName("线程1:  ");
        t2.setName("线程2:  ");
        t1.start();
        t2.start();
    }
}
class MyMethod implements Runnable{
    private ReentrantLock lock=new ReentrantLock();
    private int i=0;
    @Override
    public void run() {

        while (true){
           synchronized (this) {
//            lock.lock();
            if(i<=100) {
                notify();
                System.out.println(Thread.currentThread().getName() + i++);

            }else break;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
            //            lock.unlock();
        }
    }
}
