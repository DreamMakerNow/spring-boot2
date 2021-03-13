// DATE: 2021/2/24-19:26  Happy Every Day


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private int age;
    private String name;
    private int[] xueh;
    private List<String> subject;
    private Set<Integer> id;
    private Map<String,Integer> score;
    private Student student;

    public Person() {
    }

    public Person(int age, String name, int[] xueh, List<String> subject, Set<Integer> id, Map<String, Integer> score, Student student) {
        this.age = age;
        this.name = name;
        this.xueh = xueh;
        this.subject = subject;
        this.id = id;
        this.score = score;
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getXueh() {
        return xueh;
    }

    public void setXueh(int[] xueh) {
        this.xueh = xueh;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Set<Integer> getId() {
        return id;
    }

    public void setId(Set<Integer> id) {
        this.id = id;
    }

    public Map<String, Integer> getScore() {
        return score;
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", xueh=" + Arrays.toString(xueh) +
                ", subject=" + subject +
                ", id=" + id +
                ", score=" + score +
                ", student=" + student +
                '}';
    }
}
