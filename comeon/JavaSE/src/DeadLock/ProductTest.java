package DeadLock;

// DATE: 2021/2/1-21:06  Happy Every Day
/*
    消费问题
        生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能维持固有的数量产品（比如：20），如果生产者试图生产过多的产品
    ，店员会让生产者停一下，等有空位置了在通知继续生产；如果店中没有产品了，店员会让消费者等一下，等有产品了，在通知消费者取走产品；
 */
class Clerk{
    private int number=0;
    private final int MAX=20;
    public synchronized void input(){
                if (number<MAX) {
                    number ++ ;
                    notify();
                    System.out.println(Thread.currentThread().getName() + "：生产产品：" + "\t当前产品容量："+number);

                }else {
                    System.out.println("***********店内容量已经达到上线，停止生产**********");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
    }
    public synchronized void output(){
                if (number > 0) {

                    System.out.println(Thread.currentThread().getName()+"：消费产品："+"\t当前产品容量："+(number-1));
                    number--;
                    notify();
                }
                else {
                    System.out.println("-----------全卖完了------------");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
    }
}
class Produntor implements Runnable{
    private Clerk clerk=new Clerk();
    @Override
    public void run() {
        System.out.println("\t\t开始生产\t\t");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.input();
        }

    }

    public Produntor(Clerk clerk) {
        this.clerk=clerk;
    }
}
class Customer implements Runnable{
    private Clerk clerk=new Clerk();
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.output();
        }
    }

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Produntor produntor = new Produntor(clerk);
        Customer customer = new Customer(clerk);
        Thread p1=new Thread(produntor);
        Thread c1=new Thread(customer);
        p1.setName("生产者");
        c1.setName("消费者");
        p1.start();
        c1.start();
    }
}
