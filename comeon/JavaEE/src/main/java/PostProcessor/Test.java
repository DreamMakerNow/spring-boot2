package PostProcessor;

// DATE: 2021/2/14-10:23  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void tes1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Categroy mycate = (Categroy) applicationContext.getBean("mate");
        System.out.println(mycate.getName());
    }
}
