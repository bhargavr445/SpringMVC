package com.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
//	@RequestMapping(value="/getStudents/{id}", method=RequestMethod.GET)
//	List<Student> getAllStudents(@PathVariable("id") int id){
//		//System.out.println(id);
//		List<Student> studentsList = studentService.getAllStudents(id);
////		System.out.println(studentsList.getEmail());
////		System.out.println(studentsList.getId());
////		System.out.println(studentsList.getfName());
////		System.out.println(studentsList.getlName());
//		return studentsList;
//	}
	@RequestMapping(value="/getAllData", method=RequestMethod.GET)
	List<Student> getAlldata(){
		List<Student> studentsList = studentService.getAlldata();
		System.out.println(studentsList.size());
		return studentsList;
	}
	
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	void createStudent(@RequestBody Student student) {
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
	void deleteStudent(@RequestBody Student student) {
		studentService.deleteStudent(student);
	}
	
}
