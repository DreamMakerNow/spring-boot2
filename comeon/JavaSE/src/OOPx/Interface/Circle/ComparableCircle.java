package OOPx.Interface.Circle;

// DATE: 2021/1/28-17:02  Happy Every Day


public class ComparableCircle extends Circle implements CompareObject{

    @Override
    public int compareTo(Object o) {
        if (o instanceof ComparableCircle)
            return Double.compare(this.getRadius(), ((ComparableCircle) o).getRadius());
        else return 0;
    }
}
