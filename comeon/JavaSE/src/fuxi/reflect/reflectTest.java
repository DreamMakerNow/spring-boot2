package fuxi.reflect;

// DATE: 2021/2/23-12:50  Happy Every Day


import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class reflectTest {
    @Test
    public void test() throws Exception {
        Class<Person> cla= Person.class;
        Person p1 = cla.newInstance();
        p1.setName("范蹦");
        Method declaredMethod = cla.getDeclaredMethod("privateshow", String.class);
        declaredMethod.setAccessible(true);
        System.out.println(declaredMethod.invoke(p1, "中国人"));
        System.out.println(p1);
    }
    @Test
    public void test1() throws Exception {
        Class<Person> cla= (Class<Person>) Class.forName("fuxi.reflect.Person");
        Person p1 = cla.newInstance();
        p1.setName("范蹦");
        Method declaredMethod = cla.getDeclaredMethod("privateshow", String.class);
        declaredMethod.setAccessible(true);
        System.out.println(declaredMethod.invoke(p1, "中国人"));
        System.out.println(p1);
    }
}
