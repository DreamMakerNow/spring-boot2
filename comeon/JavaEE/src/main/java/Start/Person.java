package Start;

import java.util.*;

// new Person() 通过工厂
public class Person {
    private Integer id;
    private String name;
    private String[] emails;

    private Set<String> tels;

    private List<String> addresses;

    private Properties p;

    private Map<String,String> qqs;

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    public Map<String, String> getQqs() {
        return qqs;
    }

    public void setQqs(Map<String, String> qqs) {
        this.qqs = qqs;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("hello");
    }
    public Person() {
        System.out.println("调用了Person类的无参构造方法，私有也可以调用");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + Arrays.toString(emails) +
                ", tels=" + tels +
                ", addresses=" + addresses +
                ", p=" + p +
                ", qqs=" + qqs +
                '}';
    }
}
