package fuxi.Thread;

// DATE: 2021/2/23-10:43  Happy Every Day


public class demo1 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setName("线程1: ");
        myThread2.setName("线程二： ");
        myThread1.start();
        myThread2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==1)
                System.out.println(this.getName()+i);
        }
    }
}
