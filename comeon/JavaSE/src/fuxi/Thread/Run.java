package fuxi.Thread;

// DATE: 2021/2/23-10:48  Happy Every Day


public class Run {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.setName("线程1：");
        thread.start();
    }
}
class MyRunable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
