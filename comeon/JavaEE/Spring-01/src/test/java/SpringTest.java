// DATE: 2021/2/21-12:00  Happy Every Day


import dao.UserDao;
import dao.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import pojo.User;

import java.util.List;

public class SpringTest {
    @Test
    public void test(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.ge
        List<User> allUSer = userDao.getAllUser();
        for(User user:allUSer)
            System.out.println(user);
    }
    @Test//测试事务
    public void test1(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.login(new User());

    }
}
