package Start;

// DATE: 2021/2/12-15:04  Happy Every Day


import org.junit.Test;

public class springTest {
    @Test
    public void test1() throws Exception {
//        UserServiceImplNew userServiceImplNew = new UserServiceImplNew();
//        userServiceImplNew.login("name","123456");
        UserService userService = BeanFactory.getUserService();
        //UserService userService = BeanFactory.getUser();
        userService.login("name","123456");
        UserDAO userDAO = BeanFactory.getUserDAO();
        userDAO.save(new User("Tom","123456"));
        //User user = new User("fan","123123");
    }
}
