package MyBatisStart.pojo;

// DATE: 2021/2/19-14:10  Happy Every Day


public class Student {
    private int id;
    private String name;
    private Teacher tid;

    public Student() {
    }

    public Student(int id, String name, Teacher tid) {
        this.id = id;
        this.name = name;
        this.tid = tid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTid() {
        return tid;
    }

    public void setTid(Teacher tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                '}';
    }
}
