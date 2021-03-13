package MyBatis01;

// DATE: 2021/2/20-20:13  Happy Every Day


import org.apache.ibatis.session.SqlSession;

public class Test {
  @org.testng.annotations.Test
    public void test(){
      SqlSession sqlSession = MyBatis01Util.getSql();
      UserDaoMapper useradd = sqlSession.getMapper(UserDaoMapper.class);
      useradd.addUser(new User(11,"赵虎","456321"));
      sqlSession.close();
  }
}
