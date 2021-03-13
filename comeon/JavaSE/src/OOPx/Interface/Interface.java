package OOPx.Interface;

// DATE: 2021/1/28-15:22  Happy Every Day
/*
    接口(interface) 由于一个子类只能继承一个父类 接口的使用是解决了子类有多个功能的作用 接口和类是并列的
        1、接口中不能定义构造器 意味着接口不能实例化接口
        2、接口中通过类去实现（implement）接口 如果该类实现了接口中的所有抽象方法 则这个类就可以实例化了
        3、一个类可以实现多个接口
        4、接口与接口之间是继承 而且是多继承
 */

public class Interface {
    public static void main(String[] args) {
        System.out.println("FlySpace.MAX_SPEED = " + FlySpace.MAX_SPEED);
        System.out.println("FlySpace.SECOND_SPEED = " + FlySpace.SECOND_SPEED);
        Plane plane1=new Plane();
        plane1.fly();
        plane1.go();
        FlySpace fly1=new Plane();
        fly1.fly();
        plane1.method2();//plane1不能调用 method1  如果父类和接口中方法相同 优先调用父类（类优先原则 只针对方法）
        gooo.method1();//直接用接口调用 且（接口）只能调用静态方法
    }
}
interface A{

}
interface B{

}
interface FlySpace extends A,B{//接口多继承
    //全局变量
    public static final int MAX_SPEED=7900; //宇宙第一速度
    int SECOND_SPEED=4500;//省略了 public static final
    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract
//    public void go(){//不能定义普通方法(但能定义static  default 方法) 包括构造器
//        System.out.println("hello");
//    }
}
interface gooo{
    public void go();
    //静态方法
    public static void method1(){
        System.out.println("method1");
    }
    //默认方法
    public default void method2(){
        System.out.println("method2");
    }
    default void method3(){
        System.out.println("method3");
    }
}
class Plane extends Object implements FlySpace,gooo{//实现多个接口与继承

    @Override
    public void fly() {
        System.out.println("我能飞");
    }

    @Override
    public void stop() {
        System.out.println("我能停");
    }

    @Override
    public void go() {
        System.out.println("我能跑");
    }
}