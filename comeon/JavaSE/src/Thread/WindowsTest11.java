package Thread;

// DATE: 2021/2/1-16:25  Happy Every Day

/*
    例：创建三个窗口卖票 实现 Runable 接口的方式

 */
/*
    解决线程的安全性的方法：
        同步方法处理安全问题
        对需要进行同步的数据放到一个方法中 直接在方法上添加 synchronized
 */

public class WindowsTest11 {
    public static void main(String[] args) {
        Windows11 windows11 = new Windows11();
        Thread t11=new Thread(windows11);
        Thread t21=new Thread(windows11);
        Thread t31=new Thread(windows11);
        t11.setName("窗口1");
        t21.setName("窗口2");
        t31.setName("窗口3");
        t11.start();
        t21.start();
        t31.start();
    }

}
class Windows11 implements Runnable {
    private int ticates = 100;//这里解决了 继承Thread不需要加static 因为这里只创建了一个对象 所以只有100 但是仍然没解决安全并发性
   // final Object object=new Object();//同步监视器
    private synchronized void show(){
        if (ticates > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : 卖票,票号为：" + ticates);
            ticates--;
        }
//        else {
//            System.out.println(Thread.currentThread().getName() + "票已经卖完");
//            break;
    }
    @Override
    public  void run() {
        while (true) {
            show();
            if (ticates < 1)
                break;
            }
        }
}

