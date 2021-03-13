package OOP.duotai1;

// DATE: 2021/1/26-13:35  Happy Every Day


public class Student extends Person{
    protected String school="pku";
    public String getInfo(){
        return "Name:"+name+"\nAge:"+age+"\nSchool:"+school;
    }
}
