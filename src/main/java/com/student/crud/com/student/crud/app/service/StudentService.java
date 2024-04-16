package com.student.crud.com.student.crud.app.service;

import java.util.List;

import com.student.crud.com.student.crud.app.entity.Student;

public interface StudentService {
	public void addStudent(Student st);
	public Student getStudent(int roll);
	public List<Student> getAllStudents();
//	public List<Student> getAllStudents1();
	public void updateStudent(Student st);
	public void deleteStudent(int roll);
	
}
