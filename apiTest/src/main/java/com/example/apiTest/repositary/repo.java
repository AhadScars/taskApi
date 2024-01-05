package com.example.apiTest.repositary;

import com.example.apiTest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<Student,Integer> {

    Student findByname(String name);
}
