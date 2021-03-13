package One;

// DATE: 2021/2/20-21:20  Happy Every Day


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UserDao {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {String resouce="mybatis-config-f.xml";
            InputStream inputStream = Resources.getResourceAsStream(resouce);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSql(){
        return sqlSessionFactory.openSession(true);
    }
}
