package com.xqr.Dao;

import com.xqr.domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudent();

    //插入方法
    //int 表示操作后影响数据库的行数
    public int insertStudent(Student student);
}
