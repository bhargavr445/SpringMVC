package com.project.dao;

import java.util.List;

import com.project.entites.Student;
import com.project.entites.StudentTraining;

public interface StudentTrainingDao {

	List<StudentTraining> getAllStudents();

	Student getStudentById(int id);

	List<Integer> getAllId();

	void deleteStudent(int id);

}
