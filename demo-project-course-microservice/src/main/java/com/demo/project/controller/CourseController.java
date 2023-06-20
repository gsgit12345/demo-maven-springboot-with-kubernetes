package com.demo.project.controller;

import com.demo.project.model.Course;
import com.demo.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;
    @PostMapping(value = "/save",consumes = "application/json")
    public boolean create(@RequestBody Course course)
    {
        return courseService.create(course);
    }
    @GetMapping()
    public List<Course> getAll()
    {
        return courseService.getAll();
    }
    @GetMapping("/id")
    public Course getById(@RequestParam(value="id",defaultValue = "1") int courseId)
    {
return courseService.getById(courseId);
    }
    @PutMapping
public boolean update(@RequestBody Course course)
    {
        courseService.update(course);
        return  true;
    }
    @DeleteMapping
    public boolean delete(@RequestParam int courseId)
    {
       return  courseService.delete(courseId);
    }
}
