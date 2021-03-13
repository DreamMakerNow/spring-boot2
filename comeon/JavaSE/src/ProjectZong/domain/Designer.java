package ProjectZong.domain;

// DATE: 2021/1/31-9:47  Happy Every Day


public class Designer extends Programmer{
    private double bonus;//奖金
    public Designer(){}
    public Designer(int id, String name, int age, double salary,Equipment equipment,double bonus) {
        super(id,name,age,salary,equipment);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return id+"\t\t"+ name + "\t\t" + age + "\t\t\t" + salary+"\t\t" +"设计师"+getStatus()+"\t\t\t"+ "\t\t"+getBonus()+"\t\t" + getEquipment() ;
    }
}
