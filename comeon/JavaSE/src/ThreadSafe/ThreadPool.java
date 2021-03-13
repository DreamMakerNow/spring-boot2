package ThreadSafe;

// DATE: 2021/2/2-10:28  Happy Every Day
/*
    线程的创建方法4：
        线程池：
            1、提高响应速度（减少创建线程的时间）
            2、降低了资源消耗（重复利用线程 不需要每次都创建线程）
            3、便于线程管理
                ->corePoolSize:核心池大小
                ->maximumPoolSize:最大线程数
                ->keepAliveTime:线程没有任务时持续多久会后会终止
 */

import java.util.concurrent.*;

class ThreadRuun implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
class ThreadCall implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i < 101; i++) {
            if (i%2!=0) {
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //提供指定数量的线程池
        ExecutorService service= Executors.newFixedThreadPool(10);
        //设置线程池的属性    由于 ThreadPoolExecutor类  继承了   AbstractExecutorService类  实现了  ExecutorService接口
        //所以这里直接进行一个强转
        ThreadPoolExecutor service1=(ThreadPoolExecutor)service;
        service1.setCorePoolSize(15);

        service.execute(new ThreadRuun());//适用于runable接口
        service.submit(new FutureTask<>(new ThreadCall()));//适用于callable接口
//        try {
//            System.out.println(new FutureTask(new ThreadCall()).get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        service.shutdown();
    }
}
