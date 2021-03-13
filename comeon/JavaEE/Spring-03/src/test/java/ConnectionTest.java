// DATE: 2021/2/25-19:35  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.sql.Connection;

public class ConnectionTest {
    @Test
    public void test(){//方式一
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connectionOne = applicationContext.getBean("connectionOne",Connection.class);
        System.out.println(connectionOne);
    }
    @Test
    public void test1(){//方式二
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connTwo = applicationContext.getBean("connTwo", Connection.class);
        System.out.println(connTwo);
    }
    @Test
    public void test3(){//方式三

    }
}
