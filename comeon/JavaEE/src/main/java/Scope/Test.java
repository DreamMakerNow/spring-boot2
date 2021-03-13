package Scope;

// DATE: 2021/2/13-15:21  Happy Every Day


import org.springframework.context.support.ClassPathXmlApplicationContext;
//在文件中添加 scope="singleton" 默认是 singleton 如果创建多个scope="prototype"
//在文件中添加 lazy-init="true" 可以让类在使用时创建而不在调用文件时 前提要保证 scope="singleton" 因为创建多个对象本就在使用时才创建
public class Test {
    @org.junit.Test
    public void test1(){
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Account account = applicationContext.getBean("account", Account.class);
        Account account2 = applicationContext.getBean("account", Account.class);
        System.out.println(account==account2);
        applicationContext.close();//需要把类变成 ClassPathXmlApplicationContext
    }
}
