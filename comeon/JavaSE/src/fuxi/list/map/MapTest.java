package fuxi.list.map;

// DATE: 2021/2/23-20:48  Happy Every Day


import org.testng.annotations.Test;

import java.io.*;
import java.util.*;

//    3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0.不再是equals().
//    4.定制排序中，比较两个对象是否相同的标准为 Comparator：compare()返回0.不再是equals().
public class MapTest {
    @Test
    //自然排序
    public void test(){
        Comparator<Integer> com = Integer::compare;
        Set<Integer> set=new TreeSet<>(com);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
    @Test
    public void test1(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put(1,"AA");
        map.put(2,"BB");
        map.put(3,"CC");
        map.put(4,"DD");
        Set keyset= map.keySet();
        Collection coll=  map.values();
        System.out.println(keyset);
        System.out.println(coll);
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        System.out.println("entries = " + entries);
        for(Object obj:entries){
            Map.Entry entry= (Map.Entry) obj;
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
        System.out.println(map);
    }
    @Test
    public void test2() throws Exception {
        Properties properties=new Properties();
        InputStream inputStream=new FileInputStream("jdbc.properties");
        properties.load(inputStream);
        String name = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println(name+password);
    }
}
