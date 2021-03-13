package ThreadSafe;

// DATE: 2021/2/1-17:02  Happy Every Day
/*
    单例模式中的懒汉式
 */

public class HunTest {
}
class Bank{
    private static Bank instance=null;
    private Bank(){}
    public static  Bank getInstance(){
//        //方式一
//        if (instance==null)
//            instance=new Bank();
//        return instance;
        //方式二
        if (instance==null)
            synchronized (Bank.class) {
                if (instance == null)
                    instance = new Bank();
            }
        return instance;
    }
}
