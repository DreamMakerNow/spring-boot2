package Proxy;

// DATE: 2021/2/24-9:55  Happy Every Day


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Inv implements InvocationHandler {

    private Object obj;//需要使用被代理类的对象进行赋值

    public void get(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class cla=Class.forName("Proxy.Do");
        Do o = (Do) cla.newInstance();
        o.test();
        return method.invoke(obj, args);
    }
}
