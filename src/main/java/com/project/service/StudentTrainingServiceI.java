package com.project.service;

import java.util.List;

import com.project.entites.Student;

public interface StudentTrainingServiceI {

	List<Student> getAllStudents();

	Student getStudentById(int studentId);

}
