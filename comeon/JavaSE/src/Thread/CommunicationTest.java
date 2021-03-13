package Thread;

// DATE: 2021/2/1-20:15  Happy Every Day

//线程的交互

import java.util.concurrent.locks.ReentrantLock;

public class CommunicationTest {
    public static void main(String[] args) {
        TxTest txTest=new TxTest();
        Thread t1=new Thread(txTest);
        Thread t2=new Thread(txTest);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
class TxTest implements Runnable{
    int number=1;
    ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            synchronized (this) {


                notify();//随机唤醒其他（一个）线程 notifyAll()唤醒其他所有线程
                /*
                    在这里 当线程一进入后面的 wait() 时暂时阻塞 线程二进入这里时 线程一被唤醒
                    但此时 线程二才能打开这把锁 线程一进不来 所以形成了二者的交互
                    this.wait() this.notyfy() 都省略了this
                    同步监器可以是任意类的对象 但要注意 wait(),notify()调用的对象保持一致
                    比如 同步监视器是 Object obj=new Object(); 那么 要使用 obj.wait() obj.notify()
                 */
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                if (number<=100){
                    System.out.println(Thread.currentThread().getName()+ " : " + number);
                    number++;
                }else break;
                try {
                    wait();//使当前线程进入阻塞状态 并释放同步监视器
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        }
    }