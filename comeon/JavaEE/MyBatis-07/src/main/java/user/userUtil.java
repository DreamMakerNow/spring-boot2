package user;

// DATE: 2021/2/26-19:25  Happy Every Day


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class userUtil {
    private static SqlSessionFactory sqlSession;
    static {

        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSession=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getuserBean(){
       return sqlSession.openSession(true);
    }
}
