package com.project.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.project.dao.StudentTrainingDao;
import com.project.entites.Employee;
import com.project.entites.Student;
import com.project.entites.StudentTraining;
import com.project.service.StudentTrainingS;
import com.project.ws.StudentClient;


@Service
public class StudentTrainingImpl implements StudentTrainingS {

	
	@Autowired
	StudentTrainingDao studentTrainingDao;
	
	@Autowired
	StudentClient studentClient;
	
	
	public List<StudentTraining> getAllStudents() {
	return studentTrainingDao.getAllStudents();
		
		
	}


	public Student getStudentById(int id) {
		return studentTrainingDao.getStudentById(id);
		
	}


	public List<Integer> getAllId() {
		return studentTrainingDao.getAllId();
		
	}


	public void deleteStudent(int id) {
		studentTrainingDao.deleteStudent(id);
		
	}


	public void updateStudent(Student student) {
		studentTrainingDao.updateStudent(student);
		
	}


	public Employee getStudent(int id) {
		Employee e=null;
	try {
		 e = studentClient.getById();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
//	System.out.println(e.getEmployee_age());
//	System.out.println(e.getEmployee_name());
//		System.out.println(e.getEmployee_sal());
//		System.out.println(e.getId());
		
		return e;
		
	}


	public Employee[] getAllEmp() {
		try {
			
			return studentClient.getAllStudents();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		 
	}


	public void createEmp(Employee emp) {
		try {
			studentClient.createEmployee(emp);
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}


	public List<String> getStudentNamesList() {

		return studentTrainingDao.getStudentNamesList();
		
	}


	public void createStudent(Student stu) {
		studentTrainingDao.createStudent(stu);
		
	}


	public void deleteStudentByObj(int id) {
		studentTrainingDao.deleteStudentByObj(id);
		
	}
	
	

}
