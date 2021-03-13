package StudentTest;

// DATE: 2021/2/19-16:56  Happy Every Day


import MyBatisStart.dao.StudentMapper;
import MyBatisStart.pojo.Student;
import MyBatisStart.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> allStudent = studentMapper.getAllStudent();
        for(Student student:allStudent)
            System.out.println(student);
        sqlSession.close();
    }
}
