package Test;

// DATE: 2021/2/9-12:09  Happy Every Day

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
    String getBelief();
    void eat(String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃："+food);
    }
}
//
class ProcyFactory{
    public static Object getNewInstance(Object obj){
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myInvocationHandler);
    }
}
class MyInvocationHandler implements InvocationHandler{
    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}
public class Test {
    public static void main(String[] args) {
        SuperMan man=new SuperMan();
        Human procyFactory=(Human) ProcyFactory.getNewInstance(man);
        procyFactory.eat("豆腐");
        System.out.println(procyFactory.getBelief());
    }
}
