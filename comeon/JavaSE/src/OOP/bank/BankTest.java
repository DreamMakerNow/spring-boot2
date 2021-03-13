package OOP.bank;

// DATE: 2021/1/25-15:17  Happy Every Day


public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.add("Tom");
        bank.getCustomer(0).setAccouont(new Accouont(2000));
        bank.getCustomer(0).getAccouont().input(1000);
        System.out.println(" 余额为： " +         bank.getCustomer(0).getAccouont().getBanalce());
        bank.getCustomer(0).getAccouont().output(3000);
    }
}
