package Test1;

// DATE: 2021/2/10-10:17  Happy Every Day


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InHander implements InvocationHandler{
        private Object obj;
        public void bind(Object obj){
            this.obj=obj;
        }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Ob ob = new Ob();
        ob.me();
        return method.invoke(obj,args);
    }
}
