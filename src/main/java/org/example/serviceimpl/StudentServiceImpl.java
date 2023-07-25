package org.example.serviceimpl;

import org.example.dao.StudentDao;
import org.example.daoimpl.StudentDaoImpl;
import org.example.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentDao {

    StudentDaoImpl studentService = new StudentDaoImpl();

    @Override
    public String saveStudent(Student student) {
         return " added seccessfully student";
    }

    @Override
    public Student getStudentById(Long id) {
          return  studentService.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @Override
    public Student updateStudent(Long ollStudentId, Student newStudent) {
        return studentService.updateStudent(ollStudentId,newStudent);
    }

    @Override
    public String deleteStudentById(Long id) {
        return studentService.deleteStudentById(id);
    }
}
