package OOP.bank;

// DATE: 2021/1/25-15:02  Happy Every Day


public class Accouont {
    private double banalce;
    public Accouont(){}
    public Accouont(double banalce){
        this.banalce=banalce;
    }

    public double getBanalce() {
        return banalce;
    }

    public void setBanalce(double banalce) {
        this.banalce = banalce;
    }
    public void input(double a){
        banalce+=a;
        System.out.println("存款成功 存入金额：" + a+"当前余额为："+banalce);
    }
    public void output(double a){
        if (banalce >= a){
            banalce-=a;
            System.out.println("取款成功，余额为： " + banalce);
        }
        else System.out.println("余额不足!!!!!!");
    }
}
