package miejulei;

// DATE: 2021/2/3-9:54  Happy Every Day
/*
    使用enum关键字定义枚举类
   说明：定义的枚举类默认继承于java.lang.Enum类
   不需要重写toString方法
 */

public class SesonTest1 {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        //加不加toString都一样
        System.out.println("winter = " + winter.toString());
        //value()
        Season1[] valuess=Season1.values();
        for (int i = 0; i < valuess.length; i++) {
            System.out.println("valuess[i] = " + valuess[i]);
        }
        System.out.println("************");
        //values() 返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
        Thread.State[] values1=Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println("values1 = " + values1[i]);
        }
        System.out.println("***********");
        //valueOf(String str 可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
        Season1 summer=Season1.valueOf("SUMMER");
        System.out.println("summer = " + summer);
        summer.show();
    }
}
interface Info{
    void show();
}
//使用enum关键字枚举类
enum Season1 implements Info {
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    //2.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器,并给对象属性赋值

    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求1：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    //4.其他诉求1：提供toString()
//
//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }


    @Override
    public void show() {
        System.out.println("这是一个季节");
    }

}
enum Test{
    SPRING,SUMMER;
}
