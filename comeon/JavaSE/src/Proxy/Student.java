package Proxy;

// DATE: 2021/2/24-9:52  Happy Every Day


public class Student implements Person{
    @Override
    public void doo() {
        System.out.println("人要吃饭");
    }

    @Override
    public String eat(String food) {
        return "学生喜欢吃"+food;
    }
}
