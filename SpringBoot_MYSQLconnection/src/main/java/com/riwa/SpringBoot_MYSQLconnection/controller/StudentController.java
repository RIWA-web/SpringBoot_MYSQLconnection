package com.riwa.SpringBoot_MYSQLconnection.controller;

import com.riwa.SpringBoot_MYSQLconnection.entity.Student;
import com.riwa.SpringBoot_MYSQLconnection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/all")
    public List<Student> gtAllStudent(){
        return service.getAllStudentData();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student ){
        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
     public Student getById(@PathVariable Long id){
        return service.getStudentById(id);

     }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id)
    {
        service.deleteStudent(id);
        return "Student deleted";
    }

}
