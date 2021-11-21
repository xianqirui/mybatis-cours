package com.xqr;

import com.xqr.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    //测试方法
    @Test
    public void Testinsert() throws IOException {
            String config="mybatis.xml";
            //Resources： mybatis中的一个类， 负责读取主配置文件
            InputStream in= Resources.getResourceAsStream(config);
            //SqlSessionFactoryBuilder : 创建SqlSessionFactory对象，
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            //创建SqlSessionFactory对象
            SqlSessionFactory Factory= builder.build(in);
            //使用openSession()获取SqlSession对象
            //SqlSession sqlSession= Factory.openSession();
        //自动提交
        SqlSession sqlSession=Factory.openSession(true);
            Student student=new Student();
            student.setId(2180);
            student.setName("关羽");
            student.setAge(100);
            student.setEmail("sadwa@qq.com");
            String sqlid="com.xqr.Dao.StudentDao.insertStudent";
            int num = sqlSession.insert(sqlid,student);
            //手动提交
            //sqlSession.commit();
        System.out.println("执行结果:"+num);
            sqlSession.close();
        }

}
