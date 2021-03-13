package OOPx.Abstract;

// DATE: 2021/1/28-14:27  Happy Every Day


public class SalariedEmployee extends Employ{
    private int monthlySalay;

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalay) {
        super(name, number, birthday);
        this.monthlySalay = monthlySalay;
    }

    public SalariedEmployee(){}
    public SalariedEmployee(int monthlySalay) {
        this.monthlySalay = monthlySalay;
    }

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public int earning() {
        return monthlySalay;
    }
    public String toString(){
        return "SalariedEmployee:"+super.toString();
    }
}
