package com.project.dao;

import java.util.List;

import com.project.entites.Student;

public interface StudentDetailsDaoI {

	List<Student> getAllStudents();

	Student getStudentById(int studentId);

}
