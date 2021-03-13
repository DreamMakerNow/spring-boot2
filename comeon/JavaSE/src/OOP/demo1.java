package OOP;

// DATE: 2021/1/23-14:15  Happy Every Day
/*
        Java面向对象学习的三条主线
        1、Java类及类的成员，属性、方法、构造器、代码块、内部类
        2、面向对象的三大特征，封装性、继承性、多态性、（抽象性）
        3、其它关键字 this,super,final,static,abstract,interface,package,import

        子类重写父类方法
        1、方法名和参数相同
        2、子类的权限要不小于父类 public最大 private 最小
        3、返回值值 父类void 子类也只能void
            如果父类返回值是A类型 子类可以是A也可以是A的子类型数据
            如果父类是基本数据类型 子类也必须是 int double等
        4、子类抛出异常的类型不大于父类被重写的异常类型
        5、非static才能重写
 */
public class demo1 {

    public static void main(String[] args) throws Exception {
        Person p1=new Person();
        p1.name="范蹦";
        p1.age=21;
        p1.eat();
        p1.talk("Chinese");
        Person p2=p1;//这里 p2与p1 指向同一个地址值 所以二者的的值是同步变化的
        System.out.println("p2.name = " + p2.name);
        p2.name="fb";
        System.out.println("p1 = " + p1.name);
        new Person().eat();//匿名对象
        //二者不是同一个对象
        new Person().age=10;
        new Person().getAge();
          Person p3=new Person(20,"fbb");
        p3.put();
    }
}
class Person{
    int age;
    String name;
    //构造方法 创建对象时会调用这个方法
    public Person(){
        System.out.println("oisehgoisagvb");
    }
    public Person(int age){
        this.age=age;
    }
    public Person(String name){
        this.name=name;
    }
    public Person(int age, String name){
        this(age);
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("人一天吃三顿饭");
    }
    public void sleep(){
        System.out.println("人需要睡觉");
    }
    public void talk(String langue){
        System.out.println("我说" + langue);
    }
    public void getAge(){
        System.out.println("age = " + age);
    }
    public void put(){
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}
