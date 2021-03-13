package MyBatisStart.dao;

// DATE: 2021/2/18-13:08  Happy Every Day


import MyBatisStart.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //增删改查需要提交事务
    //增加一个用户
    public void addUser(User User);
    //按id删除一个用户
    public void deleteUser(int id);
    //按id修改一个用户的信息
    public void updateUser(User user);
    //查询所有用户
    public List<User> getUserList();
    //根据id查询用户
    public User getUserListId(int id);
    //查询某个姓
    public List<User> getNameUser(String name);
    //模糊（万能）添加 map传递参数 使用map中的key 多个参数要使用map
    public void addUserMap(Map<String,Object> map);
}
