package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.entites.Student;
import com.project.entites.StudentTraining;
import com.project.service.StudentTrainingS;

@Controller
@RequestMapping(value="training")
public class Training {
	
	@Autowired
	StudentTrainingS studentTraining;
	
	@RequestMapping(value="getAllStudents")
	public @ResponseBody List<StudentTraining> getStudent() {
		List<StudentTraining> stuList = studentTraining.getAllStudents();
		return stuList;
		
	}
	
	@RequestMapping(value="getStudent/{id}", method=RequestMethod.GET)
	public @ResponseBody Student getStudentById(@PathVariable("id") int id) {
		
		Student st = studentTraining.getStudentById(id);
		return st;
		
	}
	
	@RequestMapping(value= "getAllId", method=RequestMethod.GET) 
	public @ResponseBody List<Integer> getAllId() {
       List<Integer> idList = studentTraining.getAllId();
       return idList;
       
	}
	@RequestMapping(value= "delete/{sid}", method=RequestMethod.DELETE)
	public @ResponseBody void deleteStudent(@PathVariable("sid") int id) {
		studentTraining.deleteStudent(id);
		
		
	}
	

}
