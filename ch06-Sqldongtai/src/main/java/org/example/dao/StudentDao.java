package org.example.dao;

import org.example.domain.Student;

import java.util.List;

public interface StudentDao {
    //if标签
    List<Student> selectDeno(Student student);
    //where标签
    List<Student> selectDeno2(Student student);
    //foreach
    List<Student> selecForeach1(List<Integer> list);
    List<Student> selecForeach2(List<Student> studentlist);
    /*分页查询*/
    List<Student> selectAll();

}
