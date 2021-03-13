package MyBatisStart.utils;

// DATE: 2021/2/18-12:40  Happy Every Day

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory---->SqlSession
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //获取MyBatis的SqlSession对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static org.apache.ibatis.session.SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);
    }
}
