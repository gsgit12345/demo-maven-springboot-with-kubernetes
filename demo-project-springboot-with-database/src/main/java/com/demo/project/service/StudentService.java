package com.demo.project.service;

import com.demo.project.model.Student;

public interface StudentService {
    Student getById(int id);
    Student getByName(String name);
    boolean save(Student object);

}
