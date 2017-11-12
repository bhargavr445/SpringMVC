package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entites.Student;
import com.project.entites.StudentTraining;
import com.project.service.StudentTrainingS;

@RestController
//@RestController : First of all, we are using Spring 4′s new @RestController annotation. 
//This annotation eliminates the need of annotating each method with @ResponseBody. 
//Under the hood, @RestController is itself annotated with @ResponseBody, and can be considered as combination of @Controller and @ResponseBody.
@RequestMapping(value="training")
public class Training {
	
	@Autowired
	StudentTrainingS studentTraining;
	
	@RequestMapping(value="getAllStudents")
	public  List<StudentTraining> getStudent() {
		List<StudentTraining> stuList = studentTraining.getAllStudents();
		return stuList;
		
	}
	
	@RequestMapping(value="getStudent/{id}", method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		
		Student st = studentTraining.getStudentById(id);
		return st;
		
	}
	
	@RequestMapping(value= "getAllId", method=RequestMethod.GET) 
	public  List<Integer> getAllId() {
       List<Integer> idList = studentTraining.getAllId();
       return idList;
       
	}
	@RequestMapping(value= "delete/{sid}", method=RequestMethod.DELETE)
	public  void deleteStudent(@PathVariable("sid") int id) {
		studentTraining.deleteStudent(id);
		
		
	}
	
	@RequestMapping(value="updateStudent", method=RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student) {
		studentTraining.updateStudent(student);
	}
	

}
