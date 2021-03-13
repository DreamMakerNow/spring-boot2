package OOP.bank;

// DATE: 2021/1/25-15:03  Happy Every Day


public class Customer {
    private String name;
    private Accouont accouont;
    public Customer(){}
    public Customer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Accouont getAccouont() {
        return accouont;
    }

    public void setAccouont(Accouont accouont) {
        this.accouont = accouont;
    }
}
