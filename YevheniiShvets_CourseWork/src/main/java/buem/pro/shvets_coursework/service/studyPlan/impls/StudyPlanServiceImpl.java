package buem.pro.shvets_coursework.service.studyPlan.impls;

import buem.pro.shvets_coursework.module.StudyPlan;
import buem.pro.shvets_coursework.repository.studyPlan.StudyPlanMongoRepository;
import buem.pro.shvets_coursework.service.student.impls.StudentServiceImpl;
import buem.pro.shvets_coursework.service.studyPlan.interfaces.IStudyPlanService;
import buem.pro.shvets_coursework.service.subjects.impls.SubjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudyPlanServiceImpl implements IStudyPlanService {
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    SubjectsServiceImpl subjectsService;
    private LocalDateTime now = LocalDateTime.now();

    private List<StudyPlan> studyPlans = new ArrayList<>();
    @Autowired
    StudyPlanMongoRepository repository;

    @PostConstruct
    void init() {
        studyPlans.add(new StudyPlan("1",studentService.get("3"),subjectsService.get("1"),75,now,now));
        studyPlans.add(new StudyPlan("2",studentService.get("2"),subjectsService.get("2"),62,now,now));
        studyPlans.add(new StudyPlan("3",studentService.get("4"),subjectsService.get("3"),78,now,now));
        studyPlans.add(new StudyPlan("4",studentService.get("5"),subjectsService.get("4"),91,now,now));
        studyPlans.add(new StudyPlan("5",studentService.get("1"),subjectsService.get("5"),95,now,now));

        repository.saveAll(studyPlans);
    }

    @Override
    public StudyPlan create(StudyPlan studyPlan) {

        studyPlan.setCreatedAt(LocalDateTime.now());
        return repository.save(studyPlan);
    }

    @Override
    public StudyPlan update(StudyPlan studyPlan) {

        studyPlan.setUpdatedAt(LocalDateTime.now());
        return repository.save(studyPlan);
    }

    @Override
    public StudyPlan get(String id) {

        return repository.findById(id).get();
    }

    @Override
    public void delete(String id) {

        repository.deleteById(id);
    }

    @Override
    public List<StudyPlan> getAll() {

        return this.repository.findAll();
    }

    public List<StudyPlan> saveAll(List<StudyPlan> studyPlans) {
        return  repository.saveAll(studyPlans);
    }
}

