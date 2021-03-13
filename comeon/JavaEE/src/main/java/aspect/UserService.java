package aspect;


import Proxy.User;

public interface UserService {
    public void register(User user);

    public boolean login(String name, String password);
}
