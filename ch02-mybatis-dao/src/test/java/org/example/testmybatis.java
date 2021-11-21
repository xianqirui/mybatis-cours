package org.example;

import org.example.dao.StudentDao;
import org.example.dao.impl.StudebtDaoImpl;
import org.example.domain.Student;
import org.junit.Test;

import java.util.List;

public class testmybatis {
    @Test
    public void testSelectStudent(){
        StudentDao dao=new StudebtDaoImpl();
        List<Student> stu= dao.selectstudent();
        for (Student student:stu) {
            System.out.println(student);
        }
    }
}
