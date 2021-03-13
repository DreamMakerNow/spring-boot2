package Test;

// DATE: 2021/2/13-18:54  Happy Every Day


import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student implements Study {
    private String name;
    private int id;
    private String[] score;
    private List<String> subject;
    private Map<String,Integer> xuef;
    private Properties pro;
    private Stu stu;

    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }

    public Student() {
        System.out.println("无参构造方法");
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getScore() {
        return score;
    }

    public void setScore(String[] score) {
        this.score = score;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Map<String, Integer> getXuef() {
        return xuef;
    }

    public void setXuef(Map<String, Integer> xuef) {
        this.xuef = xuef;
    }

    public Properties getPro() {
        return pro;
    }

    public void setPro(Properties pro) {
        this.pro = pro;
    }


    @Override
    public void study(String name,int id) {
        System.out.println(name+id+"学生学习知识");
    }
}
