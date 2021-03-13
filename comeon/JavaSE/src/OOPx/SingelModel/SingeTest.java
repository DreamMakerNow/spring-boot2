package OOPx.SingelModel;

// DATE: 2021/2/23-10:34  Happy Every Day


public class SingeTest {

}
class lazy{
    private static lazy lazy;
    private String name;
    private lazy(){}
    private lazy(String name){
        this.name= name;;
    }
    public static lazy getLazy(){
        return lazy;
    }
}
class hun{
    private static hun hun=null;
    private hun(){}
    public static hun getHun(){
        if (hun != null) {
            hun=new hun();
            return hun;
        } else {
            return hun;
        }
    }
}