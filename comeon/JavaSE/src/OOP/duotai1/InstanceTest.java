package OOP.duotai1;

// DATE: 2021/1/26-13:39  Happy Every Day


public class InstanceTest {
    public static void method(Person e){
        //e.getInfo();
        System.out.println("e.getInfo() = " + e.getInfo());
        if (e instanceof Gradutae)
            System.out.println("a person");
        else if (e instanceof Student)
            System.out.println("a student\na person");
        else
            System.out.println("a graduate student\na student\na person");
    }
    public static void main(String[] args) {
        method(new Student());
    }
}
