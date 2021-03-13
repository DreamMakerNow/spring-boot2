package OOP.Circle;

// DATE: 2021/1/26-13:50  Happy Every Day


public class GeometrucObject {
    String color;
    double weight;
    public GeometrucObject(){}
    public GeometrucObject(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
}
