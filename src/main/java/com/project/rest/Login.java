package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.entites.Student;
import com.project.service.StudentService;

@Controller
@RequestMapping(value="user")
public class Login {
	
	@Autowired 
	StudentService studentService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	@ResponseBody
	public String getData() {
		return "Hello My Spring Controller";
	}
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView mv = new ModelAndView("Hello");
		return mv;
	}
	
	
	List<Student> getAllStudents(){
		List<Student> studentsList = studentService.getAllStudents();
		return studentsList;
	}
}
