package Thread;

// DATE: 2021/2/1-11:19  Happy Every Day
/*
    Thread中的常用方法
        1、start() 方法
        2、run()方法
        3、currentThread() 静态方法，返回当前执行的线程
        4、getName() 获取当前线程的名字
        5、setName() 设置当前线程的名字
        6、yield() 表示释放当前线程 有可能释放后又被当前线程抢到
        7、join() 分线程，被分的线程执行完才会执行当前线程
        8、stop() 强制结束当前线程 这个方法已经过时 不建议使用
        9、sleep() 休眠一定的时间（毫秒）
        10、isAlive() 判断线程是否还存在
 */
/*
    线程的优先级：
        MAX_PRIORITY: 10
        MIN_PRIORITY: 1
        NORm_PRIORITY: 5 默认优先级
       优先级高并不意味着一定先执行，只是概率上先执行。
        setPriority(int) 设置优先级 **要注意把休眠关掉 sleep()
        getPriority() 获取优先级

 */

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        helloThread.setName("线程一");
        helloThread.start();
        Thread.currentThread().setName("主线程+");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//主线程优先级设置为最小
        helloThread.setPriority(Thread.MAX_PRIORITY);//分线程设置成最大
        System.out.println(Thread.currentThread().getPriority());//输出主线程的优先级
        for (int i = 1; i < 101; i++) {
            if (i%2==0) {
                System.out.println(Thread.currentThread().getName() + "\t ： " + i);
            }
            if (i==20) {//这里 当 i = 20 时
                try {
                    helloThread.join();//执行这条语句 直到 helloThread 的线程执行完毕才会回来继续执行当前线程 优先级大于 yield() 不会被它影响
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ;
        System.out.println(helloThread.isAlive());
    }
}

class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i%2!=0) {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(getName() + " ： " + i);
            }
//            if (i%11==0)
//                Thread.yield();
            }
        }
    }
