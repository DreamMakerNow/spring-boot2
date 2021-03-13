package beanFactory;

// DATE: 2021/2/13-13:25  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

public class Test {
    @org.junit.Test
    public void test1(){//创建复杂对象的方式一 通过FactoryBean接口
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
                                                                                        //去掉 & 前面的类型需要使用 Connection
//        ConnectionFactoryBean conn = (ConnectionFactoryBean) applicationContext.getBean("&conn");
//        ConnectionFactoryBean conn2 = (ConnectionFactoryBean) applicationContext.getBean("&conn");
        //不带 & 创建了俩个不一样的对象，ConnectionFactoryBean  public boolean isSingleton() {
        //        return false;
        //    }如果返回true，则返回同一个对象
        Connection conn = (Connection) applicationContext.getBean("conn1");
        Connection conn2 = (Connection) applicationContext.getBean("conn1");
        System.out.println("conn = " + conn);
        System.out.println("conn2 = " + conn2);
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        //去掉 & 前面的类型需要使用 Connection
        ConnectionFactoryBean conn = (ConnectionFactoryBean) applicationContext.getBean("&conn1");

        System.out.println(conn);
    }
    @org.junit.Test
    public void test3() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");
        System.out.println("conn = " + conn);
    }
    @org.junit.Test
    public void test4(){//创建复杂对象的方式二 实例工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) applicationContext.getBean("conn");
        System.out.println("conn = " + conn);
    }
    @org.junit.Test
    public void test5(){//创建复杂对象的方式三静态工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) applicationContext.getBean("staticFactory");
        System.out.println("conn = " + conn);
    }
}
