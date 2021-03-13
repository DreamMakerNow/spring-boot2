package OOP;

// DATE: 2021/1/26-13:16  Happy Every Day

//多态
//
public class demo3 {
    public static void main(String[] args) {
        A a=new A();
        a.out();
        A b=new B();// 编译时看左边 class A 运行时看右边 class B
        //多态仅适用方法 不适用属性
        System.out.println("b.a = " + b.a);
        b.out();
        a=b;
        System.out.println("a.a = " + a.a);
        a.out();
    }
}

class A{
    int a=10;
    public void out(){
        System.out.println("A= " + this.a);
    }
}
class B extends A{
    int a=20;
    public void out(){
        System.out.println("B = " + this.a);
    }
}
class C extends A{
    int a=30;
    public void out(){
        System.out.println("C = " + this.a);
    }
}
