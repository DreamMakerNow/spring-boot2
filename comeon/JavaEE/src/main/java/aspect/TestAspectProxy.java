package aspect;


import Proxy.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectProxy {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/aspecttest.xml");
        UserService userService = (UserService) ctx.getBean("userService");
//
//        userService.login("suns", "123456");
//        System.out.println("*************");
        userService.register(new User());
    }
}
