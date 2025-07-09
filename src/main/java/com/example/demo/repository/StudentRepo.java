package com.example.demo.repository;

import com.example.demo.model.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Integer> {


}
