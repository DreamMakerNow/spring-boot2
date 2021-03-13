package MyBatis01;

// DATE: 2021/2/20-19:56  Happy Every Day


import org.apache.ibatis.annotations.Insert;

public interface UserDaoMapper {
    @Insert("insert into user (id,name,pwd) value (#{id},#{name},#{pwd})")
    public void addUser(User user);
}
