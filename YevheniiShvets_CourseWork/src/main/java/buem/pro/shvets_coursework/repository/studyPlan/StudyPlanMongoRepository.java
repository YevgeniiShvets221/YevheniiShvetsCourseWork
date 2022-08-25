package buem.pro.shvets_coursework.repository.studyPlan;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.module.StudyPlan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface StudyPlanMongoRepository extends MongoRepository<StudyPlan,String> {
    List<StudyPlan> findAllByCreatedAtAfterAndId(LocalDateTime date, String id);

}
