package Start;

import org.aopalliance.aop.Advice;

public class UserServiceImpl implements UserService, Advice {
    private UserDAO userDAO = new UserDAOImpl();

//    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register(User user) {
        userDAO.save(user);
    }

    @Override
    public void login(String name, String password) {
        this.userDAO.queryUserByNameAndPassword(name, password);
    }
}
