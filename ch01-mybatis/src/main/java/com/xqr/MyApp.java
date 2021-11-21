package com.xqr;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import com.xqr.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.misc.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {
        String config="mybatis.xml";
        //Resources： mybatis中的一个类， 负责读取主配置文件
        InputStream in=Resources.getResourceAsStream(config);
        //SqlSessionFactoryBuilder : 创建SqlSessionFactory对象，
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        //创建SqlSessionFactory对象
        SqlSessionFactory Factory= builder.build(in);
        //使用openSession()获取SqlSession对象
        SqlSession sqlSession= Factory.openSession();
        String sqlid="com.xqr.Dao.StudentDao.selectStudent";
        List<Student> studentlist = sqlSession.selectList(sqlid);
        for (Student stu:studentlist){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
