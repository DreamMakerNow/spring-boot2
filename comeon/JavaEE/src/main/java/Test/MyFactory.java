package Test;

// DATE: 2021/2/13-18:56  Happy Every Day


import Test1.Student;

public class MyFactory {
    public static Student getNewStudent() throws Exception {
        Class cla=Class.forName("Test.Student");
        return (Student) cla.newInstance();
    }

}
