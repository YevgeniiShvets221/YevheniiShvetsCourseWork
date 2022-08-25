package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.StudyPlan;
import buem.pro.shvets_coursework.service.studyPlan.impls.StudyPlanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/studyPlans")
@RestController
public class StudyPlanRestController {
    @Autowired
   StudyPlanServiceImpl service;

    @GetMapping("/")
    public List<StudyPlan> showAll(){

        return service.getAll();
    }
    @PutMapping ("/all")
    public List<StudyPlan> saveAll(@RequestBody List<StudyPlan> studyPlans){

        return service.saveAll(studyPlans);
    }
    @GetMapping("/{id}")
    public StudyPlan showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public StudyPlan insertOne(@RequestBody StudyPlan studyPlan){
        return service.create(studyPlan);
    }

    @PutMapping()
    public StudyPlan updateOne(@RequestBody StudyPlan studyPlan){
        return service.update(studyPlan);
    }
}
