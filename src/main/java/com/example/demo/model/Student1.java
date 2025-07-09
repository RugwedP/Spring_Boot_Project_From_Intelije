package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import org.antlr.v4.runtime.misc.NotNull;
//import org.springframework.lang.NonNull;

@Entity
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String Name;

    
    private int Marks;

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
