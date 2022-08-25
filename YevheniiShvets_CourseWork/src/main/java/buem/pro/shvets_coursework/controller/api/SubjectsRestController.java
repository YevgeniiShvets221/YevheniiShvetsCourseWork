package buem.pro.shvets_coursework.controller.api;

import buem.pro.shvets_coursework.module.Subject;
import buem.pro.shvets_coursework.service.subjects.impls.SubjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/subjects")
@RestController
public class SubjectsRestController {
    @Autowired
    SubjectsServiceImpl service;

    @GetMapping("/")
    public List<Subject> showAll(){

        return service.getAll();
    }
    @PutMapping ("/all")
    public List<Subject> saveAll(@RequestBody List<Subject> subjects){

        return service.saveAll(subjects);
    }
    @GetMapping("/{id}")
    public Subject showOne(@PathVariable String id){
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id){
        service.delete(id);
    }

    @PostMapping()
    public Subject insertOne(@RequestBody Subject subject){
        return service.create(subject);
    }

    @PutMapping()
    public Subject updateOne(@RequestBody Subject subject){
        return service.update(subject);
    }
}