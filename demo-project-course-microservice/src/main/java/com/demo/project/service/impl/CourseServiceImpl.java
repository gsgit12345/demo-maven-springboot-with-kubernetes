package com.demo.project.service.impl;

import com.demo.project.model.Course;
import com.demo.project.repository.CourseRepository;
import com.demo.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;
    @Override
    public boolean create(Course course) {
        courseRepository.save(course);
        return true;
    }

    @Override
    public Course getById(int courseId) {
        Course course=   courseRepository.findById(courseId).orElse(null);
        return course;
    }

    @Override
    public List<Course> getAll() {
        List<Course> course=courseRepository.findAll();
        return course;
    }

    @Override
    public boolean update(Course course) {
        courseRepository.save(course);
        return true;    }

    @Override
    public boolean delete(int courseId) {
        courseRepository.deleteById(courseId);
        return true;    }
}
