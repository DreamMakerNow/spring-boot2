package factory;


import Proxy.User;
import org.aopalliance.aop.Advice;

public class UserServiceImpl implements UserService, Advice {
    @Override
    public void login(String name, String password) {
        System.out.println("UserServiceImpl.login");
    }

    @Override
    public void register(User user) {
        System.out.println("UserServiceImpl.register");
    }
}
