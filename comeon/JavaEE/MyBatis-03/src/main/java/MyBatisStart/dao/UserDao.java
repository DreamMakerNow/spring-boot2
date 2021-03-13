package MyBatisStart.dao;

// DATE: 2021/2/18-13:08  Happy Every Day


import MyBatisStart.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //增删改查需要提交事务
    //增加一个用户
    @Insert("insert into user (id,name,pwd) value (#{id},#{name},#{password})")
    public void addUser(User User);
    //按id删除一个用户
    @Delete("delete from user where id=#{id}")
    public void deleteUser(@Param("id") int id);
    //按id修改一个用户的信息
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    public void updateUser(User user);
    //查询所有用户
    @Select("select * from user")
    public List<User> getUserList();
    //根据id查询用户
    @Select("select * from user where id=#{id}")
    //@Param("id")里面需要对应数据库的字段名
    public User getUserListId(@Param("id") int id);
    //查询某个姓
    @Select("select * from user where name like '%${name}%' ")
    public List<User> getNameUser(@Param("name") String name);
    //模糊（万能）添加 map传递参数 使用map中的key 多个参数要使用map
    public void addUserMap(Map<String,Object> map);
}
