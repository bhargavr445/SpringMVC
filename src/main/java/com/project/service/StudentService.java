package com.project.service;

import java.util.List;

import com.project.entites.Student;

public interface StudentService {

//	List<Student> getAllStudents(int id);
	boolean update(Student student);
	boolean delete(Student student);
	int createStudent(Student student);
	List<Student> getAlldata();
	void deleteStudent(Student student);
	Student getStudent(int id);
	Student getStudentById(int id);
	void createStudentTest(Student student);
	
}
