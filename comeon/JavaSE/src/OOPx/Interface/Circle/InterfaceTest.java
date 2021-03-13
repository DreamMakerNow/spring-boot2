package OOPx.Interface.Circle;

// DATE: 2021/1/28-17:05  Happy Every Day


public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle circle1=new ComparableCircle();
        ComparableCircle circle2=new ComparableCircle();
        circle1.radius=5;
        circle2.radius=6;
        System.out.println(circle1.compareTo(circle2));

    }
}
