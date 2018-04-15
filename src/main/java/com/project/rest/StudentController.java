package com.project.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.entites.Student;
import com.project.entites.TokenParams;
import com.project.entites.User;
//import com.project.entites.TokenParams;
//import com.project.entites.TokenParams;
import com.project.service.StudentTrainingServiceI;

//@CrossOrigin(origins = {"http://localhost:8585"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping(value="student")
public class StudentController {
//	@Autowired
//	StudentTrainingServiceI studentTrainingServiceI;
	
	@RequestMapping(value="logIn", method=RequestMethod.GET)
	//@RequestHeader(value="token") String token
	public void logIn(HttpServletRequest req) {
		//studentTrainingServiceI.checkDb(req.getHeader("token"));
		String header = req.getHeader("token");
		System.out.println(header);
//		TokenParams tokenParams = new TokenParams();
//		tokenParams.setAccessToken("AccessToken");
//		tokenParams.setExpiresIn("20:00 min");
//		tokenParams.setTokenType("test");
//		//tokenParams.setRole(req.getHeader("role"));
//		tokenParams.setUserName(req.getHeader("token"));
//		return tokenParams;
		//System.out.println(token);
	}
	
//	@RequestMapping(value="getAllStudents", method=RequestMethod.GET)
//	public List<Student> getAllStudents() {
//		return studentTrainingServiceI.getAllStudents();
//	}
//	
//	@RequestMapping(value="getStudentById/{id}", method=RequestMethod.GET)
//	public Student getStudentById(@PathVariable("id") int studentId) {
//		return studentTrainingServiceI.getStudentById(studentId);
//	}
}
