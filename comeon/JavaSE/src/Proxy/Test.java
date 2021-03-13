package Proxy;

// DATE: 2021/2/24-10:03  Happy Every Day


public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Person person = (Person) Pro.getNewInstance(student);
        person.doo();
        System.out.println("**********************");
        System.out.println(person.eat("米饭"));
    }
}
