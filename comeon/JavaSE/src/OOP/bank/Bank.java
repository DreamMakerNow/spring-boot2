package OOP.bank;

// DATE: 2021/1/25-15:02  Happy Every Day


public class Bank {
    private Customer[] customers;
    private int number;
    public Bank(){
        customers=new Customer[10];
    }
    public void add(String name){
        Customer customer=new Customer(name);
        customers[number++]=customer;
    }
    public int getNumber(){
        return number;
    }
    public Customer getCustomer(int index){
        if (index < 0 && index >= number)
        {
            System.out.println("错误！！！！！！");
            return null;
        }else return customers[index];
    }
}
