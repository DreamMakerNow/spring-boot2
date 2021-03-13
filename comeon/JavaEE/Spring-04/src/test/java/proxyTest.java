// DATE: 2021/2/25-20:51  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import proxy.UserService;

public class proxyTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user = (UserService) applicationContext.getBean("user");
        user.login();
    }
}
