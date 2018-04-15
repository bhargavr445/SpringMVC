package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.entites.Student;
import com.project.service.StudentService;
@CrossOrigin(origins = {"http://localhost:7070"}, maxAge = 4800, allowCredentials = "false")

@RestController
@RequestMapping(value="user")
public class Login {
	
	@Autowired 
	StudentService studentService;
	
//	@Autowired
//	Student student;
//	Login(){
//		student.setId(1);
//		student.setEmail("bhargav@gmail.com");
//		student.setfName("Bhargav Ram");
//		student.setlName("Guntaka");
//	}
//	
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
	
	
	@RequestMapping(value="/getStudent/{id}", method=RequestMethod.GET)
	public @ResponseBody Student getStudent(@PathVariable("id") int id) {
		Student studentDetails = studentService.getStudent(id);
		System.out.println(studentDetails.getEmail());
		return studentDetails;
	}
	
	@RequestMapping(value="/getAllData", method=RequestMethod.GET)
	public @ResponseBody List<Student> getAlldata(){
		List<Student> studentsList = studentService.getAlldata();
		System.out.println(studentsList.size());
		return studentsList;
	}
	
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public @ResponseBody void createStudent(@RequestBody Student student) {
		System.out.println(student.getEmail());
		studentService.createStudent(student);
//		return 1;
	}
	
	@RequestMapping(value="/barcode", method=RequestMethod.GET)
	public ModelAndView getBarcodePage() {
		ModelAndView mv = new ModelAndView("myPages/parent");
		return mv;
	}
	@RequestMapping(value="/deleteStudent", method=RequestMethod.DELETE)
	public @ResponseBody void deleteStudent(@RequestBody Student student) {
		studentService.deleteStudent(student);
	}
	
	@RequestMapping(value="/getStudentById/{id}", method=RequestMethod.GET)
	public @ResponseBody Student getStudentById(@PathVariable("id") int id) {
		Student stuList = studentService.getStudentById(id);
		return stuList;
	}
	
	@RequestMapping(value="/createStudent", method=RequestMethod.POST)
	public int createStudentTest(@RequestBody Student student) {
		studentService.createStudentTest(student);
		return 1;
	}
}

