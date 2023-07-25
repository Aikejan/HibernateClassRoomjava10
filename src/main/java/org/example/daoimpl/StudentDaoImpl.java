package org.example.daoimpl;

import org.example.config.HibernateConfig;
import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public String saveStudent(Student student) {
        Session session= HibernateConfig.getSession().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstName()+" is saved";
    }

    @Override
    public Student getStudentById(Long id) {
        Session session= HibernateConfig.getSession().openSession();
        session.beginTransaction();
       Student student = session.get(Student.class,id);
       session.getTransaction().commit();
       session.close();
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        Session session= HibernateConfig.getSession().openSession();
        session.beginTransaction();
        List<Student>students =session.createQuery("select s from  Student s",Student.class).getResultList();
        session.getTransaction().commit();
        session.close();

        return students;
    }

    @Override
    public Student updateStudent(Long ollStudentId, Student newStudent) {
        Session session= HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student oldStudent = getStudentById(ollStudentId);

        oldStudent.setFirstName(newStudent.getFirstName());
        oldStudent.setLastName(newStudent.getLastName());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setAge(newStudent.getAge());
        session.getTransaction().commit();
        session.close();
        return oldStudent;
    }

    @Override
    public String deleteStudentById(Long id) {
        Session session = HibernateConfig.getSession().openSession();
        session.beginTransaction();
        Student student = getStudentById(id);
        session.remove(student);
        session.getTransaction().commit();
        session.close();
        return student.getFirstName()+"Is successfully deleted";
    }
}
