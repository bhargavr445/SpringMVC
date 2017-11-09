package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	public void getStudent1() {
		System.out.println("Hello I am Working2");
	}
	

}
