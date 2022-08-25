package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.Student;
import buem.pro.shvets_coursework.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/students")
@RestController
public class StudentRestController {
    @Autowired
    StudentServiceImpl service;

    @GetMapping ("/")
    public List<Student> showAll(){

        return service.getAll();
    }
    @PutMapping ("/all")
    public List<Student> saveAll(@RequestBody List<Student> students){

        return service.saveAll(students);
    }
    @GetMapping("/{id}")
    public Student showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Student insertOne(@RequestBody Student student){
        return service.create(student);
    }

    @PutMapping()
    public Student updateOne(@RequestBody Student student){
        return service.update(student);
    }
}

