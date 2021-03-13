package CollaborationArrlist1;

import java.util.Objects;

/**
 * @author shkstart
 * @create 2019 下午 3:56
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() && getName().equals(user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User u=(User )o;
            int nameNum= this.name.compareTo(((User) o).name);
            if (nameNum!=0)
                return nameNum;
            else return Integer.compare(this.age,u.age);
        }else throw new RuntimeException("输入数据不符合");
    }
}
