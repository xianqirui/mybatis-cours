package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;

import org.example.domain.Student;
import org.example.utils.MybatisUtills;
import org.junit.Test;

import java.util.List;

public class testmybatis {
    @Test
    public void testSelectStudent(){
        SqlSession sqlSession= MybatisUtills.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        //调用dao方法
        List<Student> students= dao.selectstudent();
        for(Student stu:students){
            System.out.println("学生:"+stu);
        }
    }
    @Test
    public void testInsertStudent(){
        SqlSession sqlSession=MybatisUtills.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("王五");
        student.setId(1007);
        student.setEmail("45ada@qq.com");
        student.setAge(32);
        int num=dao.insertstudent(student);

        System.out.println("添加对象输"+num);
    }









   /* public void testSelectStudent(){
        StudentDao dao=new StudebtDaoImpl();
        List<Student> stu= dao.selectstudent();
        for (Student student:stu) {
            System.out.println(student);
        }
    }*/
}
