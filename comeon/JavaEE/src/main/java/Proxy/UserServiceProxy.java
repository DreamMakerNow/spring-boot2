package Proxy;

// DATE: 2021/2/14-11:36  Happy Every Day


public class UserServiceProxy implements UserService{
    private UserService userService=new UserServiceImpl();

    @Override
    public void register(User user) {
        System.out.println("------------re--------------");
        userService.register(user);
    }

    @Override
    public boolean login(String name, int age) {
        System.out.println("------------lg--------------");
        return userService.login(name,age);
    }
}
