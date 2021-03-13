package Lamda;

// DATE: 2021/2/10-11:35  Happy Every Day


import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AllTest {
    @Test
    public void test1(){
        Runnable run=new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱学习");
            }
        };
        run.run();
        System.out.println("******************************");
        Runnable run2=()-> System.out.println("我很爱学习");
        run2.run();
    }
    @Test
    public void test2(){
        Comparator<Integer> com1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(com1.compare(1, 2));
        System.out.println("********************");
        Comparator<Integer> com2=(o1,o2)-> Integer.compare(o1,o2);
        System.out.println(com2.compare(2,1));
        System.out.println("**********************");
        Comparator<Integer> com3=Integer::compare;
        System.out.println(com3.compare(1,1));
    }
    @Test
    public void test3(){
       Consumer cu1=(s)-> {
           System.out.println();
           System.out.println(s);
       };
       cu1.accept(new HashMap<String,String >().put("key","value"));
    }
    @Test
    public void test4(){
        List<String> list= Arrays.asList("长江","黄河","鸭绿江","湄公河","淮河");
        //Predicate<String> pre=(s)->s.contains("河");
        List<String> list1=file(list, s->s.contains("河"));
//        List<String> list1=file(list, new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return  (s.contains("河"));
//            }
//        });
        System.out.println(list1);
    }
    public List<String> file(List<String> list, Predicate<String> pre){
        ArrayList<String > fileList=new ArrayList<>();
        for(String str:list)
            if (pre.test(str))
                fileList.add(str);
        return fileList;
    }
}
