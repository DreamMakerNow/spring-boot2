package Test1;

// DATE: 2021/2/10-10:17  Happy Every Day


public class Student implements Person{
    @Override
    public String walk() {
        return "学生学习";
    }

    @Override
    public void eat(String food) {
        System.out.println("学生吃："+food);
    }
}
