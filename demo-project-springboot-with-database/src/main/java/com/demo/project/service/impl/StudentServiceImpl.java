package com.demo.project.service.impl;

import com.demo.project.model.Student;
import com.demo.project.repository.StudentRepository;
import com.demo.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements StudentService {
    @Autowired
    StudentRepository repository;
    @Override
    public Student getById(int id) {
        Student student=repository.findById(id).orElse(null);
        return student;
    }

    @Override
    public Student getByName(String name) {
        Student student=repository.findByName(name);

        return student;
    }

    @Override
    public boolean save(Student object) {
        //System.out.println("id:"+object.getId()+"name:"+object.getName()+"mob-"+object.getMobilNo());
        repository.save(object);
        return false;
    }
}
