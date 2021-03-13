package OOPx.Abstract;

// DATE: 2021/1/28-13:32  Happy Every Day
/*
    抽象类：
        1、abstract 修饰的类被称为抽象类 抽象类不能被实例化
    抽象方法：
        1、abstract 修饰的方法被称为抽象方法
        2、抽像方法所在的类必定是抽象类
        3、如果父类是抽象类 其子类必须要重写父类中的所有抽象方法 否则这个子类也是抽象类
        4、抽象方法只包含方法名 不包含方法体
       abstract 不能修饰属性 构造器等
       abstract 不能与 private static final 共同修饰类或者方法
 */

public class AbstractTest {
    public static void main(String[] args) {
        //Person p1= new Person();//abstract 类不能实例化
        Person p1=new Student();
        p1.work();
        Student st1=new Student();
        st1.eat();
        //创建了一个匿名子类
        Person p2=new Person() {
            @Override
            public void eat() {
                System.out.println("我是匿名子类");
            }
        };
        method(p2);
    }
    public static void method(Person p){
        p.eat();
    }
}
abstract class Person{
    int age;
    String name;
    public Person(){}
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public abstract void eat();//抽象方法只包含方法名 不包含方法体
    public void work(){
        System.out.println("人工作");
    }
}
class Student extends Person{

    @Override
    public void eat() {//对父类抽象方法进行重写 否则该子类也必须用 abstract 修饰
        System.out.println("人吃饭");
    }
    public void work(){
        System.out.println("人工作（子类）");
    }
}
