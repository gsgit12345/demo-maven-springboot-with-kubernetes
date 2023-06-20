package com.demo.project.controller;

import com.demo.project.model.Student;
import com.demo.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/id")
    public Student getById(@RequestParam(value = "id",defaultValue = "1") int id)
    {
        return service.getById(id);
    }
    @RequestMapping(value="/name",method = RequestMethod.GET)
    public Student getByName(@RequestParam(value = "name",defaultValue = "hari") String name)
    {
        return service.getByName(name);
    }
/*    @RequestMapping(value = "/save",
            consumes = "application/json",
            method=RequestMethod.POST)*/
    @PostMapping("/save")
    public boolean saveStudent(@RequestBody(required = true) Student student)
    {
        return service.save(student);
    }
}
