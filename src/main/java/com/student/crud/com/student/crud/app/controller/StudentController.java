package com.student.crud.com.student.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.crud.com.student.crud.app.entity.Student;
//import com.student.crud.com.student.crud.app.entity.Student;
import com.student.crud.com.student.crud.app.service.StudentService;

@RestController
	public class StudentController {
	
	@Autowired
	StudentService service;
	
	//CREATE
		@PostMapping("/add")
		public String addStudent(@RequestBody Student st) {
			service.addStudent(st);
			return "student added";
		}
		
	//READ
		@GetMapping("/get")
		public Student getStudent(@RequestParam("roll")int roll) {
			Student st=service.getStudent(roll);
			return st;
			
		}
		
	//get all:-fetch alll data
		@GetMapping("/getAll")
		public List<Student> getAllStudents() {
			List<Student> stList=service.getAllStudents();
			return stList;
			
		}
		
	//UPDATE
		@PutMapping("/update")
		public String updateStudent(@RequestBody Student st) {
			service.updateStudent(st);
			return "student updated";
		}
		
	//DELETE
		@DeleteMapping("/delete")
		public String  deleteStudent(@RequestParam("roll")int roll) {
			service.deleteStudent(roll);
			return "student deleted";
			
		}
	}

