package Test1;

// DATE: 2021/2/10-10:26  Happy Every Day


public class Test1 {
    public static void main(String[] args) throws Exception {
        Class<?> aClass=Class.forName("Test1.Student");
        Object o = aClass.newInstance();
        Person person=(Person) PF.getNewInstance(o);
        person.eat("米饭");
        System.out.println(person.walk());
    }

}
