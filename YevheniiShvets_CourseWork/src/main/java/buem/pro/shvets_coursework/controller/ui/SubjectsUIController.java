package buem.pro.shvets_coursework.controller.ui;

import buem.pro.shvets_coursework.form.SubjectsForm;
import buem.pro.shvets_coursework.module.Subject;
import buem.pro.shvets_coursework.service.subjects.impls.SubjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/subjects")
@Controller

public class SubjectsUIController {
    @Autowired
    SubjectsServiceImpl service;

    @GetMapping("/")
    public String showAll(Model model ){
        model.addAttribute("subjects",service.getAll());

        return "subjects";
    }
    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/subjects/";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addSubjects(Model model){

        SubjectsForm subjectsForm = new SubjectsForm();
        model.addAttribute("form",subjectsForm);
        return "addSubjects";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addSubjects(Model model, @ModelAttribute("form")SubjectsForm form){
        Subject subject = new Subject();
        subject.setName(form.getName());
        subject.setLecturesHours(form.getLecturesHours());
        subject.setPracticesHours(form.getPracticesHours());
        subject.setLaboratoryWorkHours(form.getLaboratoryWorkHours());
        service.create(subject);
        return "redirect:/ui/v1/subjects/";

    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateSubjects(Model model, @PathVariable("id") String id){
        Subject subjectToUpdate = service.get(id);
        SubjectsForm subjectsForm  = new SubjectsForm();
        subjectsForm.setId(subjectToUpdate.getId());
        subjectsForm.setName(subjectToUpdate.getName());
        subjectsForm.setLecturesHours(subjectToUpdate.getLecturesHours());
        subjectsForm.setPracticesHours(subjectToUpdate.getPracticesHours());
        subjectsForm.setLaboratoryWorkHours(subjectToUpdate.getLaboratoryWorkHours());
        subjectsForm.setUpdatedAt(subjectToUpdate.getUpdatedAt());
        subjectsForm.setCreatedAt(subjectToUpdate.getCreatedAt());
        model.addAttribute("form", subjectsForm);

        return "updateSubject";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateSubjects(@ModelAttribute("form") SubjectsForm form){
        Subject subjectToUpdate = new Subject();
        subjectToUpdate.setId(form.getId());
        subjectToUpdate.setName(form.getName());
        subjectToUpdate.setLecturesHours(form.getLecturesHours());
        subjectToUpdate.setPracticesHours(form.getPracticesHours());
        subjectToUpdate.setLaboratoryWorkHours(form.getLaboratoryWorkHours());
        subjectToUpdate.setCreatedAt(LocalDateTime.now());
        subjectToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(subjectToUpdate);

        return "redirect:/ui/v1/subjects/";
    }
}

