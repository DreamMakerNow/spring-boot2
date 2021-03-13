package blogTest;

// DATE: 2021/2/19-14:14  Happy Every Day


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
//        Teacher teacherById = teacherMapper.getTeacherById(1);
//        System.out.println(teacherById);
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> allTeach = teacherMapper.getAllTeacher();
        for (Teacher teacher:allTeach)
            System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void teast2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherStudent = teacherMapper.getAllTeacher();
        for(Teacher teacher:teacherStudent)
            System.out.println(teacher);
        sqlSession.close();
    }
}
