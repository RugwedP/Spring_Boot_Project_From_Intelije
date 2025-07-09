package com.example.demo.controller;

import com.example.demo.model.Student1;
import com.example.demo.model.Teacher;
import com.example.demo.repository.StudentRepo;
import com.example.demo.repository.TeacherRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    private  int anotherl;

    @Autowired
    private StudentService service;

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping("get-students")
    public ResponseEntity<?> getStudents()
    {
       return service.fetchStudent();
    }

    @PostMapping("add-student")
    public ResponseEntity<?> addStudent (@RequestBody Student1 student1)
    {
        System.out.println("HI");
        return  service.addStudent(student1);
    }

    @PostMapping("add-teacher")
    public ResponseEntity<?> addTeacher (@RequestBody Teacher teacher)
    {
         return new ResponseEntity<>(this.teacherRepo.save(teacher),HttpStatus.CREATED);
    }



}
