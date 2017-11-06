package com.project.dao;

import java.util.List;

import com.project.entites.Student;

public interface StudentDao {
	List<Student> getAllStudents();
	boolean update(Student student);
	boolean delete(Student student);

}
