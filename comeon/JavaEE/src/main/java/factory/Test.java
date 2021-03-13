package factory;


import Proxy.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/factorytest.xml");
        UserService userService = (UserService) ctx.getBean("userService1");

        userService.login("suns", "111111");
        userService.register(new User());
    }
}
