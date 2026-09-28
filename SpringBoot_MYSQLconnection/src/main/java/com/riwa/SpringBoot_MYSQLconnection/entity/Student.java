package com.riwa.SpringBoot_MYSQLconnection.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Column(name="student_name",nullable=false,length=100)
    private String name;
    @Column(nullable=false,unique=true)
    private String city;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Student(String name, String city, Long id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
