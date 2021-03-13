package DeadLock;

// DATE: 2021/2/1-19:46  Happy Every Day
/*
    银行有一个账户
    有两个用户分别向同一个账户存3000元，每次存1000，存三次。存完打印余额
 */

import java.util.concurrent.locks.ReentrantLock;
public class TextTest {
    public static void main(String[] args) {
        Accoount accoount=new Accoount(0);
        Customer1 customer1=new Customer1(accoount);//这里用构造的方法创建了两个有同一账户的用户
        Customer1 customer2=new Customer1(accoount);
        Thread c1=new Thread(customer1);
        Thread c2=new Thread(customer2);
        c1.setName("甲");
        c2.setName("乙");
        c1.start();
        c2.start();
    }
}
class Accoount{
    private double balance;
    ReentrantLock lock=new ReentrantLock();
    public Accoount(double balance) {
        this.balance = balance;
    }
    public void input(double atm){
        try {
            lock.lock();
            balance+=atm;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+": 存钱成功，余额为："+balance);
        } finally {
            lock.unlock();
        }
    }
}
class Customer1 implements Runnable{
    private final Accoount acc;
    public Customer1(Accoount accoount) {
        acc=accoount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.input(1000);
        }
    }
}