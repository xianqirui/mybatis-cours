package org.example;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.utils.MybatisUtills;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class testmybatis {
    @Test
    public void selectDeno() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("李四");
        student.setAge(20);
        List<Student> students= dao.selectDeno(student);
        for (Student stu:students){
            System.out.println("学生:"+stu);
        }
    }
    @Test
    public void selectDeno2() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student student=new Student();
        //student.setName("李四");
        student.setAge(20);
        List<Student> students= dao.selectDeno2(student);
        for (Student stu:students){
            System.out.println("学生:"+stu);
        }
    }
    //循环处理
    @Test
    public void selecForeach1() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Integer> list =new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        List<Student> students= dao.selecForeach1(list);
        for (Student stu:students){
            System.out.println("学生:"+stu);
        }
    }
    //2
    @Test
    public void selecForeach2() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> stulist =new ArrayList<>();
        Student s1=new Student();
        s1.setId(1001);
        stulist.add(s1);

        s1=new Student();
        s1.setId(1002);
        stulist.add(s1);

        List<Student> students= dao.selecForeach2(stulist);
        for (Student stu:students){
            System.out.println("学生:"+stu);
        }
    }
    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisUtills.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //查询插件安装
        //pageName:第几页开始
        //pageSzie:一页几个数据
        PageHelper.startPage(2,3);
        List<Student> students= dao.selectAll();
        for (Student stu:students){
            System.out.println("学生:"+stu);
        }
    }

}
