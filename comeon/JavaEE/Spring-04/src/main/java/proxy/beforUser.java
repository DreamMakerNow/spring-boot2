package proxy;

// DATE: 2021/2/25-20:38  Happy Every Day


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class beforUser implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("登录之前的检测工作");
    }
}
