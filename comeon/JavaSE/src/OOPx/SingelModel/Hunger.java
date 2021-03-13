package OOPx.SingelModel;

// DATE: 2021/1/27-14:14  Happy Every Day

//单例模式
/*
        优点：由于单例模式只建立了一个对象，减少了系统开销
 */
// 饿汉式
/*
    对构造方法进行私有化 外部无法 new 对象

    外部想要调用类内部的方法：需要在内部类中 new 对象，对内部 new 对象方法进行静态化 static 因为static在new 对象之前就加载好的
 */
import org.junit.Test;

public class Hunger {
   @Test
   public void HungerTst(){
       Hun hun1=Hun.getHun();
       Hun hun2=Hun.getHun();
       Hun.getHun().output();
       hun1.output();
       System.out.println(hun1.equals(hun2));
   }
}
class Hun{
    public static Hun hun=new Hun();
    private  Hun(){}
    public static Hun getHun(){
        return hun;
    }
    public void output(){
        System.out.println("hello!!");
    }
}