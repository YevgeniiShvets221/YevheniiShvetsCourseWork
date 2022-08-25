package buem.pro.shvets_coursework.controller.ui;

import buem.pro.shvets_coursework.form.StudentForm;
import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/students")
@Controller

public class StudentUIController {
    @Autowired
    StudentServiceImpl service;

    @GetMapping("/")
    public String showAll(Model model) {
        model.addAttribute("students", service.getAll());
        return "students";

    }

    @GetMapping("/del/{id}")
    public String deleteById(@PathVariable("id") String id) {
        service.delete(id);
        return "redirect:/ui/v1/students/";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addStudent(Model model){

        StudentForm studentForm= new StudentForm();
        model.addAttribute("form",studentForm);
        return "addStudent";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addStudent(Model model, @ModelAttribute("form")StudentForm form){
        Student student = new Student();
        student.setSurname(form.getSurname());
        student.setName(form.getName());
        student.setPatronymic(form.getPatronymic());
        student.setAddress(form.getAddress());
        student.setPhoneNumber(form.getPhoneNumber());
        service.create(student);
        return "redirect:/ui/v1/students/";

    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateStudent(Model model, @PathVariable("id") String id){
        Student studentToUpdate = service.get(id);
        StudentForm studentForm = new StudentForm();
        studentForm.setId(studentToUpdate.getId());
        studentForm.setSurname(studentToUpdate.getSurname());
        studentForm.setName(studentToUpdate.getName());
        studentForm.setPatronymic(studentToUpdate.getPatronymic());
        studentForm.setAddress(studentToUpdate.getAddress());
        studentForm.setPhoneNumber(studentToUpdate.getPhoneNumber());
        studentForm.setUpdatedAt(studentToUpdate.getUpdatedAt());
        studentForm.setCreatedAt(studentToUpdate.getCreatedAt());
        model.addAttribute("form", studentForm);

        return "updateStudent";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateStudent(@ModelAttribute("form") StudentForm form){
        Student studentToUpdate = new Student();
        studentToUpdate.setId(form.getId());
        studentToUpdate.setSurname(form.getSurname());
        studentToUpdate.setName(form.getName());
        studentToUpdate.setPatronymic(form.getPatronymic());
        studentToUpdate.setAddress(form.getAddress());
        studentToUpdate.setPhoneNumber(form.getPhoneNumber());
        studentToUpdate.setCreatedAt(LocalDateTime.now());
        studentToUpdate.setUpdatedAt(LocalDateTime.now());
        service.update(studentToUpdate);

        return "redirect:/ui/v1/students/";
    }
}
