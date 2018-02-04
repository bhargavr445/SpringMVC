package com.project.rest;

import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entites.Employee;
import com.project.entites.Student;
import com.project.entites.StudentTraining;
import com.project.exception.StudentNotFoundException;
import com.project.service.StudentTrainingS;
//@CrossOrigin(origins = {"http://localhost:8585"}, maxAge = 4800, allowCredentials = "false")
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
	
	@RequestMapping(value="getStudent/{id}", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE}, consumes= {})
	public Student getStudentById(@PathVariable("id") int id) {
		
		Student st = studentTraining.getStudentById(id);
		if(st==null) {
			throw new StudentNotFoundException("id+"+id);
		}
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
	
	@RequestMapping(value="getById/{id}", method=RequestMethod.GET)
	public Employee getStudent(@PathVariable int id) {
		System.out.println("Hello I am working with given:"+ id);
		return studentTraining.getStudent(id);
		
	}
	
	@RequestMapping(value="getAllEmp", method=RequestMethod.GET)
	public Employee[] getAllEmp() {
		//System.out.println("Hello I am working with given:"+ id);
		return studentTraining.getAllEmp();
		
		
	}
	
	@RequestMapping(value="createEmp", method=RequestMethod.POST)
	public void createEmp(@RequestBody Employee emp) {
		//System.out.println("Hello I am working with given:"+ id);
		studentTraining.createEmp(emp);
		
	}

	@RequestMapping(value="getStudentNamesList", method=RequestMethod.GET)
	public TreeSet<String> getStudentNamesList() {
		//System.out.println("Hello I am working with given:"+ id);
		List<String> namesList = studentTraining.getStudentNamesList();
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(namesList);
		return ts;
		
	}

	@RequestMapping(value="createStudent", method=RequestMethod.POST)
	public void createStudent(@RequestBody Student stu) {
		//System.out.println("Hello I am working with given:"+ id);
		System.out.println(stu.getEmail());
		 studentTraining.createStudent(stu);
		
	}
	
	@RequestMapping(value="deleteStudent/{id}", method=RequestMethod.DELETE)
	public void deleteStudentByObj(@PathVariable int id) {
		//System.out.println("Hello I am working with given:"+ id);
		studentTraining.deleteStudentByObj(id);
		
		
	}

//	@RequestMapping(value="deleteStudent/{id}", method=RequestMethod.DELETE)
//	public void deleteStudentByObj(@PathVariable int id) {
//		//System.out.println("Hello I am working with given:"+ id);
//		studentTraining.deleteStudentByObj(id);
//		
//	}

}
