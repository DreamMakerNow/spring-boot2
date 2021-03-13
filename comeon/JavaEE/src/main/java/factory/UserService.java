package factory;


import Proxy.User;

public interface UserService {
    public void login(String name, String password);

    public void register(User user);
}
