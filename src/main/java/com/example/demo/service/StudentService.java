package com.example.demo.service;

import com.example.demo.model.Student1;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public ResponseEntity<?> fetchStudent()
    {
           return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> addStudent(Student1 student1) {

        return new  ResponseEntity<>(repo.save(student1),HttpStatus.CREATED);

    }
}
