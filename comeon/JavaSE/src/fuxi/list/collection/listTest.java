package fuxi.list.collection;

// DATE: 2021/2/23-19:17  Happy Every Day


import org.testng.annotations.Test;

import java.util.*;
/*
reverse(List)：反转 List 中元素的顺序
shuffle(List)：对 List 集合元素进行随机排序
sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换

Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
Object min(Collection)
Object min(Collection，Comparator)
int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
void copy(List dest,List src)：将src中的内容复制到dest中
boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值

 */
//        增：add(Object obj)
//        删：remove(int index) / remove(Object obj)
//        改：set(int index, Object ele)
//        查：get(int index)
//        插：add(int index, Object ele)
//        长度：size()
public class listTest {
    @Test
    public void test(){
        Collection<Object> coll= new LinkedList<>();
        coll.add(1);
        coll.add("123");
        System.out.println(coll);
        boolean remove = coll.remove("123");
        System.out.println(remove);
        coll.add("234");
        System.out.println(coll.contains("234"));
//        coll.add(new String("ahonl"));
        System.out.println(coll);
    }
    @Test
    public void test1(){
        Collection<Object> collection = Arrays.asList(1,"23",false,"Tom");
        System.out.println(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**********************");
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
    @Test
    public void test2(){
        List<Object> list = Arrays.asList("123","234");
        System.out.println(list);
        System.out.println(list.size());
        List<int[]> ints = Collections.singletonList(new int[]{1, 2, 3});
        System.out.println(ints);
        System.out.println(ints.size());
        List<Integer> integers = Arrays.asList(1, 2, 3);
        System.out.println(integers);
        System.out.println(integers.size());
    }
    @Test
    public void test3(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 3, 4);
//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i)==4)
//                integers.remove(i);
//        }
        integers.remove(2);
        System.out.println(integers);
    }
    @Test
    public void test4(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {  //执行remove时，所有元素会左移
//            if (list.get(i)==2)
//                list.remove(i--);
//        }
        list.set(3,8);
        System.out.println(list.subList(1, 3));
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next()==2)
//                iterator.remove();
//        }
        list.removeIf(integer -> integer == 2);
        System.out.println(list);
    }
}
