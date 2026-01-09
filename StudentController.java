package com.learning.restApi1.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("hello")
    public String sayHello() {
        return "Hello, This is a sample controller";
    }

    @GetMapping("getAllStudents")
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }
}
