package StreamAPI;

// DATE: 2021/2/12-11:49  Happy Every Day


import Lamda1.Employee;
import Lamda1.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllTest {
    @Test
    public void test1(){
        //创建方式一
        List<Employee> list= EmployeeData.getEmployees();
        Stream<Employee> stream1 = list.stream();
        stream1.filter(e -> e.getSalary() > 7000).limit(2).forEach(System.out::println);
        //stream1.limit(3).forEach(System.out::println);
        System.out.println("*******************");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("*******************");
        list.stream().distinct().forEach(System.out::println);
        //顺序流
        Stream<Employee> stream = list.stream();
        //并行流
        Stream<Employee> parallelStream = list.parallelStream();
    }
    @Test
    public void test2(){
        //创建方式二
        int[] arr=new int[]{1,2,3};
        IntStream stream = Arrays.stream(arr);
        Employee e1 = new Employee(1001,"Tom");
        Employee e2 = new Employee(1002,"Jerry");
        Employee[] employees=new Employee[]{e1,e2};
        Stream<Employee> stream1 = Arrays.stream(employees);
    }
    @Test
    public void test3(){
        //创建方式三
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 1, 4, 5);

    }
    @Test
    public void test4(){
        //创建方式四 无限元素
        //迭代
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);

        //生成
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
    @Test
    public void test5(){
        List<String > list=Arrays.asList("AA","BB","DD","CC");
        list.stream().map(str->str.toLowerCase(Locale.ROOT)).forEach(System.out::println);
        List<Employee> list2= EmployeeData.getEmployees();
        list2.stream().map(Employee::getName).filter(name->name.length()>3).forEach(System.out::println);

    }
    @Test
    public void test6(){
        List<Employee> list= EmployeeData.getEmployees();
        System.out.println(list.stream().min((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())));
        //stream1.allMatch();
       // Predicate
    }
}