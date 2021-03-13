package converter;

// DATE: 2021/2/14-9:21  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person date = (Person) applicationContext.getBean("date");
        System.out.println(date);
    }
}
