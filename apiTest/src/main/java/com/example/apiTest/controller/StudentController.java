package com.example.apiTest.controller;

import com.example.apiTest.model.Student;
import com.example.apiTest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
        private StudentService service;


    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return service.savestudent(student);
    }

    @GetMapping("/show")
    public List<Student> showstudent()
    {
        return service.getstudent();
    }

    @GetMapping("/showById/{id}")
    public Student showid (@PathVariable Integer id){
        return service.getstudentbyid(id);
    }

@DeleteMapping("deletebyid/{id}")
    public String deletestudent (@PathVariable int id){
        return service.deletestudent(id);
}
}


