package demo1;

// DATE: 2021/2/24-13:49  Happy Every Day


public class UserImpl implements UserService{
    private String name;
    private String password;

    public UserImpl() {
    }

    public UserImpl(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserImpl{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void insert(String name, String password) {
        System.out.println("insert name:"+name+"\tpassword:"+password+"\t成功");
    }
}
