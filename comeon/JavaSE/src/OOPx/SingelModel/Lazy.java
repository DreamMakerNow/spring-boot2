package OOPx.SingelModel;

// DATE: 2021/1/27-14:26  Happy Every Day
//懒汉式
/*
    与饿汉式的区别
        1、饿汉式是提前造好对象 随时可以用（优点：安全  缺点：开始时就创建对象 会造成运行慢
        2、懒汉式 是需要时创建（优点：随用随建  缺点：线程问题上不安全（后面学到线程会优化））
 */

import org.junit.Test;

public class Lazy {
    @Test
    public void LazyTest(){
        L lazy1=L.getLazy();
        L lazy2=L.getLazy();
        lazy1.working();
        System.out.println(lazy1==lazy2);
    }
}
class L{
    private static L lazy=null;
    private L(){}
    public static L getLazy(){
        if (lazy == null)
            lazy=new L();
        return lazy;
    }
    public void working(){
        System.out.println("我在学习Java");
    }
}
