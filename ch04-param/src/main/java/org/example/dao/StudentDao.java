package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.domain.Student;
import org.example.vo.Querparam;

import java.util.List;

public interface StudentDao {
    public Student selectStudentById(Integer id);
    public List<Student> paramselect(@Param("myname") String name,@Param("myage") Integer age);

    List<Student> selectMuty(Querparam param);

    public List<Student> selectUserorder(@Param("colName") String name);

}
