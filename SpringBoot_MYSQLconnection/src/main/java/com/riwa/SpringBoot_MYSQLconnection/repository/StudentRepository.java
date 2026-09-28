package com.riwa.SpringBoot_MYSQLconnection.repository;

import com.riwa.SpringBoot_MYSQLconnection.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
