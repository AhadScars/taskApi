package com.example.apiTest.service;

import com.example.apiTest.model.Student;
import com.example.apiTest.repositary.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private repo repo;

    ////post method
    public Student savestudent(Student student) {
        return repo.save(student);
    }

    public List<Student> savestudents(List<Student> Students) {
        return repo.saveAll(Students);
    }


    /// get methods
    public List<Student> getstudent (){
        return repo.findAll();
    }
    public Student getstudentbyid (int id){
        return repo.findById(id).orElse(null);

    }

    ///delete method

    public String deletestudent(int id) {
         repo.deleteById(id);
         return "deleted no " + id;
    }

}

