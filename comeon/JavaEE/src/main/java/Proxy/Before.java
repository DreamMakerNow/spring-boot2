package Proxy;

// DATE: 2021/2/14-12:01  Happy Every Day


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Before implements MethodBeforeAdvice {
    /*
  作用：需要把运行在原始方法执行之前运行的额外功能，书写在before方法中

  Method: 额外功能所增加给的那个原始方法
          login方法

          register方法

          showOrder方法

  Object[]: 额外功能所增加给的那个原始方法的参数。String name,String password
                                           User

   Object: 额外功能所增加给的那个原始对象  UserServiceImpl
                                      OrderServiceImpl
 */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {//只能在原始方法之前
        System.out.println("动态代理的额外功能");
        //method.invoke(objects,o);
    }
}
