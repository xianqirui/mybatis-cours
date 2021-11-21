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

    //使用resultMap定义映射关系
    List<Student> selectAllStudents();
    //like模糊搜索
    List<Student> selectLikeOne(String name);
    List<Student> selectLikeTwo(String name);

}
