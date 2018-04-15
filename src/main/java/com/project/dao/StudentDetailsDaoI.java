package com.project.dao;

import java.util.List;

import com.project.entites.Student;
import com.project.entites.User;

public interface StudentDetailsDaoI {

	List<Student> getAllStudents();

	Student getStudentById(int studentId);

	User checkDb(String userName);

}
