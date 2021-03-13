package Proxy;

// DATE: 2021/2/14-11:38  Happy Every Day
//代理测试

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        UserService userService=new UserServiceProxy();
        userService.register(new User());
        userService.login("To",45);
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        OrderService orderServiceProxy = (OrderService) applicationContext.getBean("orderServiceProxy");
        // userServiceProxy.login("Tom",45);
        orderServiceProxy.showOrder();
    }
}
