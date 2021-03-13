package user;

// DATE: 2021/2/26-19:19  Happy Every Day


import java.util.List;

public interface UserService {
//    @Select("select * from user")
    public List<User> getAllUser();
}
