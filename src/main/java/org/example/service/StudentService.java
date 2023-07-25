package org.example.service;

import org.example.entity.Student;

import java.util.List;

public interface StudentService {

    ///  CRUD  METHOD;

    String SaveStudent(Student student);


    Student getStudentById(Long id);

    List<Student> getAllStudent();


    Student updateStudent(Long ollStudentId, Student newStudent);


    String deleteStudentById(Long id);
}
