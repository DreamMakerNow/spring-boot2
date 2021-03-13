package Lamda1;

// DATE: 2021/2/10-15:18  Happy Every Day


import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class AllTest
{
    @Test
    public void test1(){
        Employee employee=new Employee(1001,"Tom",23,5600);
        //Supplier<String> e1=()-> employee.getName();
        Supplier<String> e1=employee::getName;
        System.out.println(e1.get());
    }
    @Test
    public void test2(){
        Comparator<String> com1=(o1,o2)->o1.compareTo(o2);
        System.out.println(com1.compare("abc","abd"));
        Comparator<String> com2= String::compareTo;
        System.out.println(com2.compare("abd","abc"));
    }
    @Test
    public void test3(){
        BiPredicate<String,String> pre1=(t1,t2)->t1.equals(t2);
        System.out.println(pre1.test("abc","abc"));
        BiPredicate<String,String> pre2=String::equals;
        System.out.println(pre2.test("abc","abd"));
    }
    @Test
    public void test4(){
        Function<Employee,String> fun1=t1-> t1.getName();
        System.out.println(fun1.apply(new Employee("Tom")));
        Function<Employee,String> fun2=Employee::getName;
        System.out.println(fun2.apply(new Employee("Mark")));
    }
    @Test
    public void test5(){
        Function<Integer,Employee> fun1=id -> new Employee(id);
        //Function<String,Employee> fun2=name -> new Employee(name);
        System.out.println(fun1.apply(1001));
        Function<Integer,Employee> fun3=Employee::new;
        System.out.println(fun3.apply(1002));
    }
    @Test
    public void test6(){
        BiFunction<Integer,String,Employee> bif1=(id,name)->new Employee(id,name);
        System.out.println(bif1.apply(1001,"Tom"));
        BiFunction<Integer,String,Employee> bif2=Employee::new;
        System.out.println(bif2.apply(1002,"Mark"));
    }
    @Test
    public void test7(){
        Function<Integer,String[]> fun1=length->new String[length];
        String[] apply = fun1.apply(5);
        System.out.println(Arrays.toString(apply));
        Function<Integer,String[]> fun2=String[]::new;
        String[] apply1 = fun2.apply(5);
        System.out.println(Arrays.toString(apply1));
    }
    @Test
    public void test8(){
        Function<Integer,Integer> fun1=t->t+2;
        System.out.println(fun1.apply(1));
    }
}
