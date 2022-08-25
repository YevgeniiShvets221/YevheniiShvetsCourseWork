package buem.pro.shvets_coursework.service.subjects.impls;

import buem.pro.shvets_coursework.module.Subject;
import buem.pro.shvets_coursework.repository.subjects.SubjectsMongoRepository;
import buem.pro.shvets_coursework.service.subjects.interfaces.ISubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class SubjectsServiceImpl implements ISubjectsService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Subject> subjects = new ArrayList<>(
            Arrays.asList(
                    new Subject( "1","WEB-design",
                            60,45,30,now,now),
                    new Subject( "2","Artificial Intelligence",
                            75,50,35,now,now),
                    new Subject( "3","Numerical methods",
                            45,30,15,now,now),
                    new Subject( "4","Modern Databases",
                            45,45,30,now,now),
                    new Subject( "5","Theory of algorithms",
                            40,20,20,now,now)));
    @Autowired
    SubjectsMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(subjects);

    }

    @Override
    public Subject create(Subject subject) {
        subject.setCreatedAt(LocalDateTime.now());
        return  repository.save(subject);
    }

    @Override
    public Subject update(Subject subject) {

        subject.setUpdatedAt(LocalDateTime.now());
        return repository.save(subject);
    }

    @Override
    public Subject get(String id) {

        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {

        repository.deleteById(id);
    }

    @Override
    public List<Subject> getAll() {

        return this.repository.findAll();
    }

    public List<Subject> saveAll(List<Subject> subjects) {
        return repository.saveAll(subjects);
    }
}