import MyBatisStart.dao.UserDao;
import MyBatisStart.pojo.User;
import MyBatisStart.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.List;

// DATE: 2021/2/18-19:12  Happy Every Day
public class TestDemo1 {
    static Logger logger=Logger.getLogger(TestDemo1.class);
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
        logger.info("info进图log4j");
        logger.debug("debug进图log4j");
        logger.error("error进图log4j");
    }
}
