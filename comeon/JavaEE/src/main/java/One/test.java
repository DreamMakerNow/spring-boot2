package One;

// DATE: 2021/2/20-21:25  Happy Every Day


import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

public class test {
    @Test
    public void test(){
        SqlSession sql = UserDao.getSql();
        userdaomapper mapper = sql.getMapper(userdaomapper.class);
        mapper.addUser(new User(12,"赵虎","789456"));
        sql.close();
    }
}
