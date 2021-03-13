package OOP.Object;

// DATE: 2021/1/26-16:40  Happy Every Day


public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("Tom",21);
        Person p2=new Person("Tom",21);
        System.out.println(p1.equals(p2));//如果不对 equals 进行重写 输出结果是false 重写后就能正常输出
        System.out.println(p1.toString());//OOP.Object.Person@14f7e
        System.out.println(p1);//OOP.Object.Person@14f7e
        String str="hahah";
        System.out.println("str = " + str);
        System.out.println("str.toString() = " + str.toString());
        String[] strings=new String[]{"hello"};
        System.out.println("strings = " + strings);//[Ljava.lang.String;@4554617c
        System.out.println("strings = " + strings.toString());//[Ljava.lang.String;@4554617c

    }
}
