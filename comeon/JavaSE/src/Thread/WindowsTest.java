package Thread;

// DATE: 2021/2/1-13:17  Happy Every Day
/*
    多线程的创建方法 1；
    例：创建三个窗口卖票 继承 Thread类的方式
 */
public class WindowsTest {
    public static void main(String[] args) {
        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
class Windows extends Thread{
    private static int ticates=100;//static 解决了每个对象100张票的问题 但是没有解决并发性的问题
    static Object object=new Object();//如果不加 static 三个对象就是三把锁
    @Override
    public void run() {

            while (true) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                synchronized(object) {
                if (ticates > 0) {
                    System.out.println(getName() + " : 卖票,票号为：" + ticates);
                    ticates--;
                } else {
                    System.out.println(getName() + "票已经卖完");
                    break;
                }
            //}
        }
    }
}