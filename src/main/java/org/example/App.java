package org.example;

import org.example.entity.Student;
import org.example.serviceimpl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        StudentServiceImpl studentService = new StudentServiceImpl();
        //System.out.println(studentService.saveStudent(new Student("Asan", "Turatov", "asan@gmail.com", 27)));
          studentService.getStudentById(1L);
        //studentService.getAllStudent();
        //studentService.updateStudent(3L,new Student("Aizada","Kubanychbekova",
        //        "aizada@gmail.com",20));

    }
}
