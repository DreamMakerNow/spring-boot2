package fuxi.MeiJu;

// DATE: 2021/2/23-12:40  Happy Every Day


public class Enum {
    public static void main(String[] args) {
        MyEnum myEnum=MyEnum.SPRIng;
        System.out.println(myEnum);
    }
}
enum MyEnum{
    SPRIng("春天","春暖花开","hello");
    private final String name;
    private final String desc;
    private final String aha;

    private MyEnum(String name, String desc,String aha) {
        this.name = name;
        this.desc = desc;
        this.aha=aha;
    }

    @Override
    public String toString() {
        return "MyEnum{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", aha='" + aha + '\'' +
                '}';
    }
}
