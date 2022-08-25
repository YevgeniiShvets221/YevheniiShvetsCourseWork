package buem.pro.shvets_coursework.service.student.interfaces;

import buem.pro.shvets_coursework.module.Student;

import java.util.List;

public interface IStudentService {
    Student create (Student student);
    Student update (Student student);
    Student get (String id);
    void delete (String id);
    List <Student> getAll();

    
}
