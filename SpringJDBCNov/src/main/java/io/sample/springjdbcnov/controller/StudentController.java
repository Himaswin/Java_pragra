package io.sample.springjdbcnov.controller;


import io.sample.springjdbcnov.entity.StudentEntity;
import io.sample.springjdbcnov.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/students")
    public List<StudentEntity> getAll(){
        return studentRepo.getAllStudents();
    }
}
