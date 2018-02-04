package com.project.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entites.Student;
import com.project.service.StudentService;
import com.project.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	public boolean update(Student student) {
		
		return false;
	}
	public boolean delete(Student student) {
		
		return false;
	}
	public int createStudent(Student student) {
		return studentDao.createStudent(student);
	
	}
	public List<Student> getAlldata() {
		return studentDao.getAllData();
		
	}
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
		
	}
	public Student getStudent(int id) {
		return studentDao.getStudent(id);

	}
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
		 
	}
	public void createStudentTest(Student student) {
		studentDao.createStudentTest(student);
		
	}

}
