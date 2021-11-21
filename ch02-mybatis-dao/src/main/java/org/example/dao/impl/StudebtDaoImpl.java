package org.example.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.utils.MybatisUtills;

import java.util.List;

public  class StudebtDaoImpl implements StudentDao {

    @Override
    public List<Student> selectstudent() {
        //获取SqlSession对象
        SqlSession sqlSession= MybatisUtills.getSqlSession();
        String sql="org.example.dao.StudentDao.selectstudent";
        //执行sql语句
        List<Student> students=sqlSession.selectList(sql);
        sqlSession.commit();
        sqlSession.close();
        return students;
    }
    public int insertstudent(Student student){
        return 10;
    }
}
