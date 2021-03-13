package OOPx.Static;

// DATE: 2021/1/27-13:22  Happy Every Day

// static 和代码块
/*
    运行顺序 父类静态（代码块） > 子类静态（代码块） > 父类非静态（代码块） > 父类非静态（代码块） > 父类构造器（构造方法）>子类构造器（构造方法）
 */
import org.junit.Test;

public class StaticTest {

    @Test
    public void test1(){
        Chinese.action="运动";//这个属性早于类的创建的 所以可以提前定义
        Chinese.sport();
        Chinese p1=new Chinese();
        p1.name="姚明";
        p1.action="打篮球";
        // System.out.println(p1.name+p1.action);
        p1.out();
        Chinese p2=new Chinese();
        p2.name="马龙";
        p2.action="打乒乓球";
        p2.out();
        p1.out();//static 属性是早于类的创建的 而且 static 属性是所有这个类共有的属性 一个变 所有都变

    }
}
class Chinese{
    int age;
    String name;
    static String action;
    static {
        System.out.println("我是静态代码块，类被加载的时候我就被调用,我可以对静态属性等进行初始化");
    }
    {
        System.out.println("我是非静态代码块，每创建一个对象，我都会被调用一次(我比构造方法都先执行)，我还可以对对象进行初始化");
    }
    public void out(){
        System.out.println(name+action);
    }
    public static void sport(){
//       System.out.println(name+"喜欢运动");//static 方法也是早编译的 所以这里不能调用普通属性 和方法
//       out();
        System.out.println(Chinese.action);
    }
}