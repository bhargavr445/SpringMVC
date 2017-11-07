package com.project.dao;

import java.util.List;

import com.project.entites.Student;

public interface StudentDao {
//	Student getAllStudents(int id);
	boolean update(Student student);
	boolean delete(Student student);
	int createStudent(Student student);
	List<Student> getAllData();
	void deleteStudent(Student student);

}
