 package com.student.crud.com.student.crud.app.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.crud.com.student.crud.app.entity.Student;
import com.student.crud.com.student.crud.app.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
		StudentRepository repo;

	public void addStudent(Student st) {
	repo.save(st);
}

	
	public Student getStudent(int roll) {
		Student st= repo.findById(roll).get();
		return st;
	}


	public List<Student> getAllStudents() {
		List<Student> stList=repo.findAll();		
		return stList;
	}


	
	public void updateStudent(Student st) {
		repo.save(st);
		
	}


	
	public void deleteStudent(int roll) {
		// TODO Auto-generated method stub
		repo.deleteById(roll);
	}

}
