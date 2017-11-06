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
	StudentDao StudentDao;
	public List<Student> getAllStudents() {
		List<Student> allStudents = StudentDao.getAllStudents();
		return allStudents;
	}
	public boolean update(Student student) {
		
		return false;
	}
	public boolean delete(Student student) {
		
		return false;
	}

}
