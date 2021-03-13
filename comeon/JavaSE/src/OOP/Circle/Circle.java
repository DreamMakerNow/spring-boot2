package OOP.Circle;

// DATE: 2021/1/26-13:52  Happy Every Day


public class Circle extends GeometrucObject{
    double radius;
    int a=20;
    String name="haha";
    public Circle(double radius,String color,double weight){
        super();
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }

}
