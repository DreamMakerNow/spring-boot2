package DongTai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// DATE: 2021/2/12-14:39  Happy Every Day
interface Person{
    public void speak();
    public String sport(String srt);
}
class Student implements Person{

    @Override
    public void speak() {
        System.out.println("学生会说外语");
    }

    @Override
    public String sport(String srt) {
        return "学生会"+srt;
    }
}
class INva implements InvocationHandler{
    private Object obj;
    public  void bin(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}
class Pxy{

    public static Object getNew(Object obj){
        INva handler = new INva();
        handler.bin(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Person person= (Person) Pxy.getNew(student);
        person.speak();
        System.out.println(person.sport("学习"));
    }
}
