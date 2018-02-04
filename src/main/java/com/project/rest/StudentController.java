package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.entites.Student;
import com.project.service.StudentTrainingServiceI;
//@CrossOrigin(origins = {"http://localhost:8585"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping(value="student")
public class StudentController {
	
	@Autowired
	StudentTrainingServiceI studentTrainingServiceI;
	
	@RequestMapping(value="getAllStudents", method=RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentTrainingServiceI.getAllStudents();
		
	}//git test
	@RequestMapping(value="getStudentById/{id}", method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int studentId) {

		return studentTrainingServiceI.getStudentById(studentId);
		

	}
	
	
	

}
