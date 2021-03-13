// DATE: 2021/2/24-19:32  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appicationContext.xml");
        Person per = (Person) applicationContext.getBean("per");
        System.out.println(per);
    }
}
