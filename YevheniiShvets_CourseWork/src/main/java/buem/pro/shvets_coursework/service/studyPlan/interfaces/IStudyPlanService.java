package buem.pro.shvets_coursework.service.studyPlan.interfaces;

import buem.pro.shvets_coursework.module.StudyPlan;

import java.util.List;

public interface IStudyPlanService {
    StudyPlan create (StudyPlan studyPlan);
    StudyPlan  update (StudyPlan studyPlan);
    StudyPlan  get (String id);
    void   delete (String id);
    List<StudyPlan > getAll();

}
