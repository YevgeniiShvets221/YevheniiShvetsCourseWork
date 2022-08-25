package buem.pro.shvets_coursework.controller.ui;

import buem.pro.shvets_coursework.form.StudyPlanForm;
import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.module.StudyPlan;
import buem.pro.shvets_coursework.module.Subject;
import buem.pro.shvets_coursework.service.student.impls.StudentServiceImpl;
import buem.pro.shvets_coursework.service.studyPlan.impls.StudyPlanServiceImpl;
import buem.pro.shvets_coursework.service.subjects.impls.SubjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/ui/v1/studyPlans")
@Controller
public class StudyPlanUIController {
    @Autowired
    StudyPlanServiceImpl service;
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    SubjectsServiceImpl subjectsService;

    @GetMapping("/")
    public String showAll(Model model){
        List<StudyPlan> studyPlans = service.getAll();
        model.addAttribute("studyPlans", studyPlans);
        return "studyPlans";
    }
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/studyPlans/";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addStudyPlan(Model model){
        StudyPlanForm studyPlanForm = new StudyPlanForm();
        var surname = studentService.getAll().stream().map
                (student -> student.getSurname()).collect(Collectors.toList());
        var subjects = subjectsService.getAll().stream().map
                (subject -> subject.getName()).collect(Collectors.toList());
        model.addAttribute("students",surname);
        model.addAttribute("subjects",subjects);
        model.addAttribute("form",studyPlanForm);
        return "addStudyPlan";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addSubjects(Model model, @ModelAttribute("form")StudyPlanForm form){
        String studentSurname = form.getStudent();
        Student studentFromDB = studentService.getAll().stream().filter
                (student -> student.getSurname().equals(studentSurname)).findFirst().orElse(null);
        String subjectName = form.getSubject();
        Subject subjectFromDB = subjectsService.getAll().stream().filter
                (subject -> subject.getName().equals(subjectName)).findFirst().orElse(null);

        StudyPlan studyPlan = new StudyPlan();
        studyPlan.setStudent(studentFromDB);
        studyPlan.setSubject(subjectFromDB);
        studyPlan.setMark(form.getMark());
        service.create(studyPlan);
        return "redirect:/ui/v1/studyPlans/";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editStudyPlan(Model model, @PathVariable("id") String id){
        StudyPlanForm studyPlanForm  = new StudyPlanForm();
        StudyPlan studyPlanToUpdate = service.get(id);
        studyPlanForm.setId(studyPlanToUpdate.getId());
        studyPlanForm.setStudent(studyPlanToUpdate.getStudent().getSurname());
        studyPlanForm.setSubject(studyPlanToUpdate.getSubject().getName());
        studyPlanForm.setMark(studyPlanToUpdate.getMark());
        studyPlanForm.setCreatedAt(studyPlanToUpdate.getCreatedAt());
        studyPlanForm.setUpdatedAt(studyPlanToUpdate.getUpdatedAt());
        var subjects = subjectsService.getAll()
                .stream()
                .map(subject -> subject.getName())
                .collect(Collectors.toList());
        var students = studentService.getAll()
                .stream()
                .map(student -> student.getSurname())
                .collect(Collectors.toList());
        model.addAttribute("students", students);
        model.addAttribute("subjects",subjects);
        model.addAttribute("form", studyPlanForm);

        return "updateStudyPlan";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editStudyPlan(Model model,
                             @ModelAttribute("form") StudyPlanForm form,
                             @PathVariable("id") String id){

        StudyPlan studyPlanToUpdate = service.get(id);
        studyPlanToUpdate.setId(form.getId());
        String studentSurname = form.getStudent();
        Student student = studentService.getAll()
                .stream().filter(st -> st.getSurname().equals(studentSurname))
                .findFirst().orElse(null);
        studyPlanToUpdate.setStudent(student);
        String subjectName = form.getSubject();
        Subject subject = subjectsService.getAll()
                .stream().filter(sub -> sub.getName().equals(subjectName))
                .findFirst().orElse(null);
        studyPlanToUpdate.setSubject(subject);
        studyPlanToUpdate.setMark(form.getMark());
        //LocalDateTime date = form.getCreatedAt();
        //customToUpdate.setCreatedAt(date);
        studyPlanToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(studyPlanToUpdate);
        return "redirect:/ui/v1/studyPlans/";
    }

}


