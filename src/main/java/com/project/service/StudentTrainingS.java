package com.project.service;

import java.util.List;

import com.project.entites.Student;
import com.project.entites.StudentTraining;

public interface StudentTrainingS {

	List<StudentTraining> getAllStudents();

	Student getStudentById(int id);

	List<Integer> getAllId();

	void deleteStudent(int id);

}
