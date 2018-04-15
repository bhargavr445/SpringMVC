package com.project.service;

import java.util.List;

import com.project.entites.Student;
import com.project.entites.User;

public interface StudentTrainingServiceI {

	List<Student> getAllStudents();

	Student getStudentById(int studentId);

	User checkDb(String header);

}
