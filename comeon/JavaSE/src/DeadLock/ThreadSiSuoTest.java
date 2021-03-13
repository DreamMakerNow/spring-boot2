package DeadLock;

// DATE: 2021/2/1-17:12  Happy Every Day
/*
    死锁的演示：
        死锁：出现死锁时，不会报异常，不会出提示，只是所有进程都处于阻塞状态 无法继续
    加上休眠之后会大概率产生死锁
 */
public class ThreadSiSuoTest {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        new Thread(){
            @Override
            public void run() {
                synchronized (s1){
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s1.append('a');
                    s2.append('1');
                    synchronized (s2){
                        s1.append('b');
                        s2.append('2');
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    s1.append('c');
                    s2.append('3');
                    synchronized (s1){
                        s1.append('d');
                        s2.append('4');
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
    }
}
