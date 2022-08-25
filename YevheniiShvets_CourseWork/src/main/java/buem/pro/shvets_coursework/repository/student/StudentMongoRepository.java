package buem.pro.shvets_coursework.repository.student;

import buem.pro.shvets_coursework.module.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StudentMongoRepository extends MongoRepository<Student,String> {
    List<Student> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);

}
