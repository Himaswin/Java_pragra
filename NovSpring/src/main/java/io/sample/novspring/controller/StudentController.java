package io.sample.novspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/getstudent")
    public String getStudentName(){
        return "Student name is Tom";
    }
    @GetMapping("/getRollNo")
    public String getStudentRollNo(){
        return "101";
    }
}
