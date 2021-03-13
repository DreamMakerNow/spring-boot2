package Reflect;

// DATE: 2021/2/8-19:28  Happy Every Day


import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class AllTest {
    @Test
    public void test1(){//正常
        Person person = new Person("Tom",12);
        person.age=18;
        System.out.println(person);
        person.show();
    }
    @Test
    public void test2() throws Exception{//反射
        //调用通用构造器 属性 方法
        Class<Person> cla=Person.class;
        Constructor<Person> constructor = cla.getConstructor(String.class, int.class);
        Person obj = constructor.newInstance("Tom",18);
        System.out.println(obj);
        obj.show();
        Field age = cla.getField("age");
        age.set(obj,45);
        System.out.println(obj);
        Method show = cla.getMethod("show");

        show.invoke(obj);
//        String str= (String) showNation.invoke(obj,"中国");
//        System.out.println(str);
        //调用私有
        System.out.println("***********************");
        Constructor<Person> constructor1 = cla.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person p1= constructor1.newInstance("Jerry");
        System.out.println(p1);
        Field name = cla.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Lisa");
        age.set(p1,18);
        System.out.println(p1);
        Method showNation = cla.getDeclaredMethod("showNation",String.class);
        showNation.setAccessible(true);
        String str=(String) showNation.invoke(p1,"中国");
        System.out.println(str);
    }
    @Test
    public void test3() throws Exception {
        Person person=new Person();
        Class<? extends Person> aClass = person.getClass();
        Class<?> aClass1 = Class.forName("Reflect.Person");
        System.out.println(aClass+"\n"+aClass1);
    }
    @Test
    public void test4() throws Exception {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(new File("jdbc.properties"));
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();
    }
    @Test
    public void test5() throws IllegalAccessException, InstantiationException {
       Class<Person> cla= Person.class;
        Person person = cla.newInstance();
        System.out.println(person);
    }
}
