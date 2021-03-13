package OOP.Circle;

// DATE: 2021/1/26-13:55  Happy Every Day


public class MyRectangle extends GeometrucObject{
    double weidth;
    double height;
    public MyRectangle(double weidth,double height,String color,double weight){
        super();
        this.weidth=weidth;
        this.height=height;
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        return weidth*height;
    }
}
