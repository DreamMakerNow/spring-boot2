package Thread;

// DATE: 2021/2/1-16:24  Happy Every Day
/*
    多线程的创建方法 1；
    例：创建三个窗口卖票 继承 Thread类的方式
 */
public class WindowsTest01 {
    public static void main(String[] args) {
        Windows01 w1 = new Windows01();
        Windows01 w2 = new Windows01();
        Windows01 w3 = new Windows01();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
class Windows01 extends Thread{
    private  int ticates=100;//static 解决了每个对象100张票的问题 但是没有解决并发性的问题
    static Object object=new Object();//如果不加 static 三个对象就是三把锁
    private  void show(){//这里的 synchronized 的默认同步器是 this 因为三个对象不同 所以要加 static
        if (ticates > 0){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : 卖票,票号为：" + ticates);
            ticates--;
        }
    }
    @Override
    public void run() {
        while (true) {
            show();
            if (ticates < 1)
                break;
        }
    }
}
