package Proxy;

// DATE: 2021/2/24-9:53  Happy Every Day


import java.lang.reflect.Proxy;

public class Pro {
    public static Object getNewInstance(Object obj){
        Inv inv = new Inv();
        inv.get(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),inv);
    }
}

