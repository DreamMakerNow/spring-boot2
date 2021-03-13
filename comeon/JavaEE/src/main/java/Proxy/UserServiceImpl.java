package Proxy;

// DATE: 2021/2/14-11:35  Happy Every Day


public class UserServiceImpl implements UserService{
    @Override
    public void register(User user) {
        System.out.println("核心业务运算 DAO");
    }

    @Override
    public boolean login(String name, int age) {
        System.out.println("核心2");
        return true;
    }
}
