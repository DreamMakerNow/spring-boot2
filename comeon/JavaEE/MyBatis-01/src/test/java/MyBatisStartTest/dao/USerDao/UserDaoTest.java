package MyBatisStartTest.dao.USerDao;

// DATE: 2021/2/18-13:24  Happy Every Day


import MyBatisStart.dao.UserDao;
import MyBatisStart.pojo.User;
import MyBatisStart.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //方式一 getMapper
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userdao.getUserList();
        for(User user:userList)
            System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //方式二 不推荐使用
        List<User> userList = sqlSession.selectList("MyBatisStart.dao.UserDao.getUserList");
        for(User user:userList)
            System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        User user = userdao.getUserListId(2);
        System.out.println(user);
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        userdao.addUser(new User(8,"Mark","123456"));
        //System.out.println(user);
        //sqlSession.commit();//提交事务才能插入
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        userdao.deleteUser(2);
        //System.out.println(user);
        sqlSession.commit();//提交事务才能插入
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userdao = sqlSession.getMapper(UserDao.class);
        userdao.updateUser(new User(8,"Mark","456789"));
        //System.out.println(user);
        //sqlSession.commit();//提交事务才能插入
        sqlSession.close();
    }
    @Test
    public void test6(){//模糊（万能）添加 map传递参数 使用map中的key 多个参数要使用map
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("uid",5);
        map.put("uname","麻子");
        map.put("upwd","1234546");
        userDao.addUserMap(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test7(){
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        //SqlSession sqlSession=MyBatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> username = userDao.getNameUser("范");
        for (User name:username
             ) {
            System.out.println(name);
        }
    }
}
