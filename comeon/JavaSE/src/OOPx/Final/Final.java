package OOPx.Final;

// DATE: 2021/1/27-16:03  Happy Every Day
/*
    final
        1、final 修饰类 类不能被继承
        2、final 修饰方法 方法无法被重写
        3、final 修饰变量 “变量”就变成常量了
            3.1 修饰属性时 可以使用显示赋值 代码块赋值 构造器赋值
 */
import org.junit.Test;

public class Final {
    @Test
    public void FinalTest(){
        Final final1=new FinalSon();
        final1.work();
    }
    final public void work(){
        System.out.println("work");
    }
}
final class FinalSon extends Final{
    final int a=10;
    //代码块赋值
    final int b;//单独存在时会报错
    {
        b=20;
    }

    //构造器赋值
    final int c;//单独存在时会出错
    public  FinalSon(){
        c=30;
    }
    public  FinalSon(int x){
        c=x;//不写会报错 即使无参构造方法中已经写过了
    }
//    public void work(){ 无法重写
//        System.out.println("I'm Working");
//    }
}
//class FinalGradson extends FinlaSon{ 报错 无法继承
//
//}
