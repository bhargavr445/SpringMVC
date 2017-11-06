package com.project.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.StudentDao;
import com.project.entites.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<Student> getAllStudents() {
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
		
	}

	public boolean update(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Student student) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
