package Thread;

// DATE: 2021/2/1-13:55  Happy Every Day
/*
    例：创建三个窗口卖票 实现 Runable 接口的方式

 */
/*
    解决线程的安全性的方法：
        1、同步代码块
        synchronized (同步监视器) {
            被监视的代码
        }
            说明 -> 操作共享数据的代码，即为需要被同步的代码
                 -> 共享数据：多个线程共同操作的数据 比如:在这里 票数就是共享数据
                 -> 同步监视器 俗称：锁。任何一个类的对象都可以是同步监视器。多个线程要用同一把锁
        缺点：只能有一个线程参与，其他线程等待，相当于单线程操作，效率低。
 */

public class WindowsTest1 {
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
    private int ticates = 100;//这里解决了 继承Thread不需要加static 因为这里只创建了一个对象 所以只有100 但是仍然没解决安全并发性
    final Object object=new Object();//同步监视器
    @Override
    public void run() {
            while (true) {
//                synchronized(object) {//这里面包裹了需要被同步的代码 这里this也可以
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
//            }
        }
    }
}
