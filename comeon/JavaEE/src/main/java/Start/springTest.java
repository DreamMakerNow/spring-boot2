package Start;

// DATE: 2021/2/12-15:04  Happy Every Day


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.util.*;

public class springTest {
    @Test
    public void test1() {
//        UserServiceImplNew userServiceImplNew = new UserServiceImplNew();
//        userServiceImplNew.login("name","123456");
        UserService userService = BeanFactory.getUserService();
        //UserService userService = BeanFactory.getUser();
        userService.login("name","123456");
        UserDAO userDAO = BeanFactory.getUserDAO();
        userDAO.save(new User("Tom","123456"));
        //User user = new User("fan","123123");
    }
    @Test//用于测试第一个Spring 程序
    public void test2(){
        //1.获得Spring的工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        //2.通过工厂类获得对象
        Person person =(Person)applicationContext.getBean("person");
        System.out.println(person);
    }
    @Test
    public void test3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("person = " + person);
        Person bean = applicationContext.getBean(Person.class);//这种方法不建议使用
        System.out.println("bean = " + bean);
    }
    @Test
    public void test4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");

        //获取所有id值
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String b:beanDefinitionNames)
            System.out.println(b);

        //只获取Person类对象的id
        System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(Person.class)));
        //用于判断是否存在指定id的bean值
        //二者的区别
        System.out.println(applicationContext.containsBeanDefinition("hello"));//只能判断id 不能判断name
        System.out.println(applicationContext.containsBean("world"));//id name 都能判断
    }
    @Test
    public void test5(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        System.out.println(Arrays.toString(applicationContext.getBeanNamesForType(User.class)));
    }
    @Test
    public void test6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        person.show();
//        person.setName("范蹦");//这样存在耦合
//        person.setId(45418121);
        System.out.println("name="+(person.getName() +"\tid="+ person.getId()));
        System.out.println("--------------------------------");
        String[] emails=person.getEmails();
        for(String em:emails)
            System.out.print(em+"\t");
        System.out.println("\n--------------------------------");
        List<String> add=person.getAddresses();
        for(String ad:add)
            System.out.print(ad+"\t");
        System.out.println("\n--------------------------------");
        Map<String,String> map=person.getQqs();
        Set<String > keySet=map.keySet();
        for(String key:keySet)
            System.out.println("key="+key+"\tvaluye="+map.get(key));
        System.out.println("--------------------------------");
        Properties pro=person.getP();
        System.out.println("key1 is"+pro.getProperty("key1"));
        System.out.println("key2 is"+pro.getProperty("key2"));
        System.out.println("--------------------------------");
        System.out.println(person);
        System.out.println("*******************************");
        UserServiceImpl userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.register(new User("Tom","123456"));
    }
}
