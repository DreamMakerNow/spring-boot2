package MyBatisStart.dao;

// DATE: 2021/2/19-14:12  Happy Every Day


import MyBatisStart.pojo.Student;

import java.util.List;

public interface StudentMapper {
    public List<Student> getAllStudent();
    public List<Student> getAllStudentByTid(int tid);


}
