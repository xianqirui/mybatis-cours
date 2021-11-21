package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;

import org.example.domain.Student;
import org.example.utils.MybatisUtills;
import org.example.vo.Querparam;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class testmybatis {
    @Test
    public void selectStudentById() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //调用dao方法
        Student students = dao.selectStudentById(1005);

        System.out.println("学生:" + students);

    }

    @Test
    public void paramselect() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //调用dao方法
        List<Student> students = dao.paramselect("王五", 17);
        for (Student stu : students) {
            System.out.println("学生:" + stu);
        }

    }

    @Test
    public void selectMuty() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //调用dao方法
        Querparam param = new Querparam();
        param.setParamName("李四");
        param.setParamAge(17);
        List<Student> students = dao.selectMuty(param);
        for (Student stu : students) {
            System.out.println("学生:" + stu);
        }
    }
//按列名排序
    @Test
    public void selectUserorder() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //调用dao方法
        List<Student> studentsdao=dao.selectUserorder("age");
        for (Student stu : studentsdao) {
            System.out.println("学生:" + stu);
        }


    }

}
