package com.example.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assignment.model.Input;
import com.example.assignment.model.Student;
import com.example.assignment.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/login")
	public String login(@RequestBody Student s ) {
		return service.loginStudent(s) ;
	}
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student s) {
	return	service.addstudent(s) ;
	}

	@GetMapping("/get")
	public List<Student> getStudent() {
		return service.getstudent();
	}
	
	@PutMapping("/update/{id}")
	public Student update(@PathVariable("id") int id, @RequestBody Student s) {
		return service.updatestudent(id,s);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		service.deletestudent(id);
	}
	@GetMapping("/fib")
	public void fibonacci(@RequestBody Input in ) {
	service.fibonacciNumbers(in.getInput1(),in.getInput2()) ;	
	}
}