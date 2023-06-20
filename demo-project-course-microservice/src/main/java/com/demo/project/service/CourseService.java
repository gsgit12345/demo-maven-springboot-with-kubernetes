package com.demo.project.service;

import com.demo.project.model.Course;

import java.util.List;

public interface CourseService {
    boolean create(Course course);
    Course getById(int courseId);
    List<Course> getAll();
    boolean update(Course course);
    boolean delete(int courseId);

}
