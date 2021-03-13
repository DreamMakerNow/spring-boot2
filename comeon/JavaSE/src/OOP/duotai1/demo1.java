package OOP.duotai1;

// DATE: 2021/1/26-14:28  Happy Every Day


public class demo1 {
    public static void main(String[] args) {
        A a=new B();
        a.out(1,2,3);

        B b=(B)a;//强制 A 转成 B
        b.out(1,2,3);//这里直接调用 B 中方法
    }
}
class A{
    public void out(int a,int... arr){
        System.out.println("A");
    }
}
class B extends A{
    public void out(int a,int[] arr){//重写了 A 中的 out
        System.out.println("B1");
    }
    public void out(int a,int b,int c){// 没有被重写 所以 a.out(1,2,3); 不会调用
        System.out.println("B2");
    }
}
