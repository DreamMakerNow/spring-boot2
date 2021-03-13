package Test;

// DATE: 2021/2/19-10:18  Happy Every Day


import MyBatisStart.dao.UserDao;
import MyBatisStart.pojo.User;
import MyBatisStart.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public class AnnotationTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for(User user:userList)
            System.out.println(user);

        User user = userDao.getUserListId(3);
        System.out.println("***********");
        System.out.println(user);
        userDao.addUser(new User(7,"Tom","ahgoiaksf"));
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //userDao.deleteUser(7);
        //userDao.updateUser(new User(5,"麻子","123456"));
        List<User> userList = userDao.getNameUser("范");
        for(User user:userList)
            System.out.println(user);
        sqlSession.close();
    }
}
