package pojo;

// DATE: 2021/2/21-14:44  Happy Every Day


import dao.UserDao;
import dao.UserService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
/*       并发安全性  3 2 1
         运行效率  1 2 3
    Isolation.READ_COMMITTED不可脏读   Isolation.REPEATABLE_READ不可重复读(库锁)  Isolation.SERIALIZABLE不可幻影读（锁表）
 */
//
@Transactional(isolation = Isolation.SERIALIZABLE)
public class UserImpl implements UserService, Serializable {
    private UserDao userDao;

    public UserImpl() {
    }

    public UserImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login(User user) {
        System.out.println("事务添加成功");
        userDao.getAllUser();
        throw new RuntimeException("test");
    }
}
