package OOP.Test;

// DATE: 2021/1/26-19:54  Happy Every Day

// String 类型----->基本数据类型、包装类、调用包装类的  parseXxx(String s)
// 基本数据类型-----> String 调用 String 重载的 valOf(Xxx xxx)
// 包装类   -------> String toString()方法
//String-------->包装类 Integer Float等
//还有许多自动封装 拆分
public class WrapperTest {
    public static void main(String[] args) {
        Test1();
    }
    public static void Test1(){
        //Integer 对整数数字进行封装
        Object o1=true?new Integer(1):new  Double(2.0);//两者数据类型需要统一
        System.out.println("o1 = " + o1);//1.0
        System.out.println("-------------------");
        
        int num1=10;
        Integer in1=new Integer(num1);
        Integer in11=90;//自动封装
        System.out.println("in1 = " + in1);
        System.out.println("in1 = " + in1.toString());
        Integer in2=new Integer("123");
        System.out.println("in2 = " + in2);
        
        Float f1=new Float("123.25");
        System.out.println("f1 = " + f1);
        
        Boolean b1=new Boolean("true123");
        System.out.println("b1 = " + b1);

        System.out.println(String.valueOf(in11));
        
        String str="123";
        System.out.println("str = " + str);
        System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));
        System.out.println("---------------------------");
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);//false
        System.out.println("---------------");
        Integer m=1;
        Integer n=1;
        System.out.println(m==n);//true
        System.out.println("-------------");
        Integer x=128;
        Integer y=128;System.out.println(x==y);//false IntegerCache中 定义了一Inter[] 数据范围 -128~127 自动封装 拆分都在这个范围的
                                                //不在范围内 重新 new一个 所以地址二者不同
    }
}
