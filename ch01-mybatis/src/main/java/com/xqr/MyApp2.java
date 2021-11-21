package com.xqr;

import com.xqr.domain.Student;
import com.xqr.utils.MybatisUtills;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp2 {
    public static void main(String[] args) throws IOException {

        //使用openSession()获取SqlSession对象
        SqlSession sqlSession= MybatisUtills.getSqlSession();
        String sqlid="com.xqr.Dao.StudentDao.selectStudent";
        List<Student> studentlist = sqlSession.selectList(sqlid);
        for (Student stu:studentlist){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
