package com.project.service;

import java.util.List;

import com.project.entites.Employee;
import com.project.entites.Student;
import com.project.entites.StudentTraining;

public interface StudentTrainingS {

	List<StudentTraining> getAllStudents();

	Student getStudentById(int id);

	List<Integer> getAllId();

	void deleteStudent(int id);

	void updateStudent(Student student);

	 Employee getStudent(int id);

	Employee[] getAllEmp();

	void createEmp(Employee emp);

	List<String> getStudentNamesList();

	void createStudent(Student stu);

	void deleteStudentByObj(int id);

	Student getDetailsByName(String name);
	

}
