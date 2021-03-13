package ProjectZong.domain;

// DATE: 2021/1/31-9:47  Happy Every Day


public class Architect extends Designer{
    private int stock;//奖励股票数
    public Architect(){}
    public Architect(int id, String name, int age, double salary,Equipment equipment,double bonus,int stock) {
        super(id,name,age,salary,equipment,bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return id +"\t\t"+ name + "\t\t" + age + "\t\t\t" + salary+ "\t\t"+"架构师" + getStatus() + "\t\t"+getBonus()+"\t\t"+getStock() +"\t\t"+getEquipment();
    }
}
