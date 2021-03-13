package OOP.Circle;

// DATE: 2021/1/26-14:00  Happy Every Day
//多态 是运行时行为

public class GeometricTest {
    public void dispaly(GeometrucObject o){
        System.out.println("面积为："+o.findArea());
    }
    public  boolean equalsArea(GeometrucObject a, GeometrucObject b){
        if (a.findArea()==b.findArea())
            return true;
        else return false;
    }
    public static void main(String[] args) {
        GeometricTest test=new GeometricTest();
        Circle circle=new Circle(5,"white",2);
        Circle circle1=new Circle(5,"white",2);
        test.dispaly(circle);
        MyRectangle myRectangle=new MyRectangle(2,5,"red",4);
        test.dispaly(myRectangle);
        MyRectangle myRectangle1=new MyRectangle(2,5,"red",4);

        System.out.println("CircleArea = MyRectangleArea ?"+test.equalsArea(circle,myRectangle));
    }
}
