package buem.pro.shvets_coursework.service.subjects.interfaces;

import buem.pro.shvets_coursework.module.Subject;

import java.util.List;

public interface ISubjectsService {
    Subject create (Subject subject);
    Subject update (Subject subject);
    Subject get (String id);
    void  delete (String id);
    List<Subject> getAll();

}
