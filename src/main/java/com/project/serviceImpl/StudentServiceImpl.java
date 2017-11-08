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
//	public List<Student> getAllStudents(int id) {
//		Student allStudents = studentDao.getAllStudents(id);
//		return allStudents;
//	}
	public boolean update(Student student) {
		
		return false;
	}
	public boolean delete(Student student) {
		
		return false;
	}
	public int createStudent(Student student) {
		int status = studentDao.createStudent(student);
		return status;
	}
	public List<Student> getAlldata() {
		List<Student> stuList = studentDao.getAllData();
		return stuList;
	}
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
		
	}
	public Student getStudent(int id) {
		Student studentDetails=studentDao.getStudent(id);
		return studentDetails;
	}
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Student studentList = studentDao.getStudentById(id);
		return studentList;
	}
	public void createStudentTest(Student student) {
		studentDao.createStudentTest(student);
		
	}

}
