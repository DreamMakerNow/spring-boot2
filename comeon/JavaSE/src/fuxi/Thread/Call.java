package fuxi.Thread;

// DATE: 2021/2/23-10:55  Happy Every Day


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Call {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCall myCall = new MyCall();
        FutureTask futureTask = new FutureTask<>(myCall);
        Thread thread = new Thread(futureTask);

        thread.setName("线程1：");
        thread.start();
        System.out.println("futureTask.get() = " + futureTask.get());
    }
}
class MyCall implements Callable{
    private int sum;
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + i);
                sum+=i;
            }
        }
        return sum;
    }
}
