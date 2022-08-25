package buem.pro.shvets_coursework.service.student.impls;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.repository.student.StudentFakeRepository;
import buem.pro.shvets_coursework.repository.student.StudentMongoRepository;
import buem.pro.shvets_coursework.service.student.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student("1", "Shvets", "Yevhenii",
                            "Valeriyovich", "Shevchenko street",
                            "0673390600", now, now),
                    new Student("2", "Pavlov", "Petro",
                            "Maksymovych", "Segedskaya street",
                            "0673485732", now, now),
                    new Student("3", "Potapova", "Alyona",
                            "Oleksandrivna", "Bocharova street",
                            "0502345824", now, now),
                    new Student("4", "Panova", "Hanna",
                            "Olehivna", "Pushkina avenue",
                            "0934121190", now, now),
                    new Student("5", "Avanesyan", "Karim",
                            "Hrantovich", "Kamanina street",
                            "0934852340", now, now)));
    @Autowired
    StudentMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(students);

    }

    @Override
    public Student create(Student student) {
        student.setCreatedAt(LocalDateTime.now());
        return  repository.save(student);
    }

    @Override
    public Student update(Student student) {
        student.setUpdatedAt(LocalDateTime.now());

        return repository.save(student);
    }

    @Override
    public Student get(String id) {

        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {

        repository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {

        return this.repository.findAll();
    }

    public List<Student> saveAll(List<Student> students) {
           return  repository.saveAll(students);
    }
}
