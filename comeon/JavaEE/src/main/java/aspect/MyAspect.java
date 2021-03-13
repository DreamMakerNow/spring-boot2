package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


/*
       1. 额外功能
                 public class MyArround implements MethodInterceptor{

                      public Object invoke(MethodInvocation invocation){

                              Object ret = invocation.proceed();

                              return ret;

                      }

                 }

       2. 切入点
             <aop:config
                 <aop:pointcut id=""  expression="execution(* login(..))"/>
 */
@Aspect//表示切面类
public class MyAspect {
    @Pointcut("execution(* aspect..login(..))")
    public void myPointcut(){}

    @Around(value="myPointcut()")
    public Object arround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("----aspect log ------");

        Object ret = joinPoint.proceed();


        return ret;
    }


    @Around(value="myPointcut()")
    public Object arround1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----aspect tx ------");
        Object ret = joinPoint.proceed();
        return ret;
    }

}
