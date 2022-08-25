package buem.pro.shvets_coursework.repository.subjects;

import buem.pro.shvets_coursework.module.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SubjectsMongoRepository extends MongoRepository<Subject,String> {
    List<Subject> findAllByCreatedAtAfterAndId(LocalDateTime date, String id);

}
