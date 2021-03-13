package blogTest;

// DATE: 2021/2/19-17:03  Happy Every Day


import MyBatisStart.dao.TeacherMapper;
import MyBatisStart.pojo.Teacher;
import MyBatisStart.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public class teacherTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> allTeacher = teacherMapper.getAllTeacher();
        for(Teacher teacher:allTeacher)
            System.out.println(teacher);
        sqlSession.close();
    }
}
