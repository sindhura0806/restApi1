package com.learning.restApi1.sample;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAll() {

        List<Student> studentList = new ArrayList<>();
        Student sana = new Student("Sana",  6);
        Student sara= new Student("Sara", 23);
        Student arjun= new Student("Arjun", 11);

        studentList.add(sana);
        studentList.add(sara);
        studentList.add(arjun);

        return studentList;
    }

}
