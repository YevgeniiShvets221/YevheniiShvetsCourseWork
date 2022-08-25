package buem.pro.shvets_coursework.repository.subjects;

import buem.pro.shvets_coursework.module.Subject;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class SubjectsFakeRepository {
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
    public List<Subject> findAll() {

        return this.subjects;
    }

    public Subject findByID(String id) {
        return subjects.stream().filter(subjects -> subjects.getId().equals(id)).findFirst().orElse(null);
    }

    public Subject update(Subject subject) {
        this.deleteById(subject.getId());
        subject.setUpdatedAt(LocalDateTime.now());
        this.subjects.add((Subject) subject);
        return (Subject) subject;
    }

    public void deleteById(String id) {
        Subject subject = this.findByID(id);
        this.subjects.remove(subject);
    }

    public Subject save(Subject subject) {
        subject.setId(UUID.randomUUID().toString());
        subject.setCreatedAt(LocalDateTime.now());
        subjects.add(subject);
        return subject;
    }
}

