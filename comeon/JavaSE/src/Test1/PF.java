package Test1;

// DATE: 2021/2/10-10:17  Happy Every Day


import java.lang.reflect.Proxy;

public class PF {

        static Object getNewInstance(Object obj){
            InHander inHander=new InHander();
            inHander.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),inHander);
    }
}
