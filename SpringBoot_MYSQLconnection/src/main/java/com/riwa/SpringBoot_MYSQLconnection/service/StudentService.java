package com.riwa.SpringBoot_MYSQLconnection.service;

import com.riwa.SpringBoot_MYSQLconnection.entity.Student;
import com.riwa.SpringBoot_MYSQLconnection.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudentData(){
        List<Student> all = repository.findAll();
        return all;


    }

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public Student getStudentById(Long id)
    {
        return repository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
    }

    public void deleteStudent(Long id)
    {
        repository.deleteById(id);
    }

}
