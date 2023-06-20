package com.demo.project.repository;

import com.demo.project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}



//note:-Repository name should be EntityName+Repository.then it will work other wise no.
//JpaRepository containes basic crud functionality