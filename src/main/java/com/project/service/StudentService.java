package com.project.service;

import java.util.List;

import com.project.entites.Student;

public interface StudentService {

	List<Student> getAllStudents();
	boolean update(Student student);
	boolean delete(Student student);
	
}
