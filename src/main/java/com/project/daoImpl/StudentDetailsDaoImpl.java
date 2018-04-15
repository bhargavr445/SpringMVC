package com.project.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.project.dao.StudentDetailsDaoI;
import com.project.entites.Student;
import com.project.entites.User;

@Repository
public class StudentDetailsDaoImpl implements StudentDetailsDaoI {

	public List<Student> getAllStudents() {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		List<Student> list = openSession.createQuery(" from Student").list();
		return list;
	}

	public Student getStudentById(int studentId) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		 //Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 //Transaction beginTransaction = openSession.beginTransaction();
		 Student student = (Student)openSession.get(Student.class, studentId);
		return student;
	}

	@Override
	public User checkDb(String userName) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		User user = (User) openSession.createQuery(" from User");
		return user;
	}

}
