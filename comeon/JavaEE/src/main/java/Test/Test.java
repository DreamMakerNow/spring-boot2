package Test;

// DATE: 2021/2/12-18:40  Happy Every Day


import Start.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
    @org.testng.annotations.Test
    public void testt(){
        String configPath = "src/main/resources/applicationContext.xml";
        ApplicationContext ctx = new FileSystemXmlApplicationContext(configPath);
    }
    public static void main(String[] args) {
        //1.获得Spring的工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过工厂类获得对象
        Person person =(Person)applicationContext.getBean("person");
        System.out.println(person);
    }
    @org.testng.annotations.Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("test.xml");
        Student stu = applicationContext.getBean("stu", Student.class);
        System.out.println(stu.getName()+"\t"+stu.getId());
        System.out.println("-------------------------------");
        String[] score = stu.getScore();
        for(String sco:score)
            System.out.print(sco+"\t");
        System.out.println("\n-------------------------------");
        List<String> subject = stu.getSubject();
        for (String sub:subject)
            System.out.print(sub+"\t");
        System.out.println("\n-------------------------------");
        Map<String, Integer> xuef = stu.getXuef();
        Set<Map.Entry<String, Integer>> entrySet=xuef.entrySet();
        for (Map.Entry<String, Integer> key:entrySet)
            System.out.print(key+"\t");
        System.out.println("\n-------------------------------");
        Properties pro = stu.getPro();
        System.out.println("key 121 value is"+pro.getProperty("121"));
        System.out.println("key 282 value is"+pro.getProperty("282"));
        System.out.println("key 123 value is"+pro.getProperty("123"));
        Stu stu1 = stu.getStu();
        System.out.println("stu1 = " + stu1);
        System.out.println(stu);
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/test.xml");
        Connection conn= (Connection) applicationContext.getBean("Tycoon");
        System.out.println(conn);
    }
}
