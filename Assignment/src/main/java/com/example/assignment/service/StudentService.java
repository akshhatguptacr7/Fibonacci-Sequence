package com.example.assignment.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.Repository.StudentRepository;
import com.example.assignment.model.Student;

@Service
public class StudentService {

	@Autowired
	public StudentRepository sr;

	public Student addstudent(Student s) {
	return sr.save(s) ;
	}

	public List<Student> getstudent() {
		return sr.findAll();
	}

	
	public Student updatestudent(int id, Student sNew) {

		Student sOld = sr.findById(id).get();
		System.out.println(sNew.getName());
		sOld.setName(sNew.getName());
		
		return sr.save(sOld);
	}

	public void deletestudent(int id) {
			sr.deleteById(id);
	}

	public String loginStudent(Student s ) {
		String Status = " " ;
		Student sOld = sr.findById(s.getRollno()).get();
		String  enteredEmail = s.getEmail();
		String storedEmail = sOld.getEmail();
		String  enteredPassword = s.getPassword();
		String storedPassword = sOld.getPassword();
		if((enteredEmail.equals(storedEmail)) && (enteredPassword.equals(storedPassword))) {
			Status = "Login Successful.";
		}else {
			Status = "Login Unsuccessful." ;
		}
		
		return Status;
	}
	public void fibonacciNumbers(int a , int b ) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the first number");
	         a = sc.nextInt();
	     System.out.println("Enter the first number");
	         b = sc.nextInt();
	        int c =0 ;
	        for(int i = a ; i<=10 ; i++) {
	            c = a + b;
	            System.out.println(c);
	            a = b;
	            b = c;
	        }
	}
}
