package com.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentDetailsDaoI;
import com.project.entites.Student;
import com.project.service.StudentTrainingServiceI;

@Service
public class StudentTrainingServiceImpl implements StudentTrainingServiceI {
	@Autowired
	StudentDetailsDaoI studentDetailsDaoI;

	public List<Student> getAllStudents() {
		return studentDetailsDaoI.getAllStudents();


	}

	public Student getStudentById(int studentId) {
		
		return studentDetailsDaoI.getStudentById(studentId);
		
	}

}
