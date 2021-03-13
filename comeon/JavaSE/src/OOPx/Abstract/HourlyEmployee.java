package OOPx.Abstract;

// DATE: 2021/1/28-14:36  Happy Every Day


public class HourlyEmployee extends Employ{
    private int wage,hour;

    public HourlyEmployee(){}

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(int wage, int hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int earning() {
        return wage*hour;
    }
    public String toString(){
        return "HourlyEmployee:"+super.toString();
    }
}
