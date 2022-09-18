package com.example.assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

}
