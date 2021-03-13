// DATE: 2021/2/26-19:24  Happy Every Day


import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import user.User;
import user.UserService;
import user.userUtil;

import java.util.List;

public class userTest {
    @Test
    public void test(){
        SqlSession sqlSession = userUtil.getuserBean();
        UserService service = sqlSession.getMapper(UserService.class);
        List<User> allUser = service.getAllUser();
        for (User user:allUser)
            System.out.println(user);

    }
}
