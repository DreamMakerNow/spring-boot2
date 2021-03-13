package ThreadSafe;

// DATE: 2021/2/2-9:54  Happy Every Day

/*
    线程的创建方法3：
        Callable接口创建线程的方法：
        同 Runable 只是 Callable接口需要重写的是 call方法
       Callable方法的优点
        1、有返回值
        2、能处理异常
        3、支持泛型（这里还没学到）
 */
// String 类型----->基本数据类型、包装类、调用包装类的  parseXxx(String s)
// 基本数据类型-----> String 调用 String 重载的 valOf(Xxx xxx)
// 包装类   -------> String toString()方法
//String-------->包装类 Integer Float等
//还有许多自动封装 拆分

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallable {
    public static void main(String[] args) {
        ThreadNew threadNew = new ThreadNew();
        FutureTask futureTask=new FutureTask(threadNew);//这个类也实现了 Runable方法 这里需要使用
        Thread thread=new Thread(futureTask);
        thread.start();
        try {
            Object sum=futureTask.get();
            System.out.println("return sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
class ThreadNew implements Callable{
    int sum=0;
    @Override
    public Object call() throws Exception {
        for (int i = 1; i < 101; i++) {
            if (i%2==0) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("sum = " + sum);
        return sum;//这里对sum进行了自动封箱
    }
}
