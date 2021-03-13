package fuxi.reflect;

// DATE: 2021/2/23-12:48  Happy Every Day


public class Person {
    String name;
    private int age;

    public Person() {}
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println("I'm Chinese");
    }
    private String privateshow(String str){
        return "你是"+str;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
