package com.project.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.project.dao.StudentDao;
import com.project.entites.Student;

@Repository
//@Transactional
public class StudentDaoImpl implements StudentDao{
	


	public boolean update(Student student) {

		return false;
	}

	public boolean delete(Student student) {
				return false;
	}

	public Student getAllStudents(int id) {

		return null;
	}


	public List<Student> getAllData() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		List<Student> list = openSession.createQuery(" from Student").list();
		return list;
	}


	public int createStudent(Student student) {
		 Configuration configuration = new Configuration();
		 configuration.configure("hibernate.cfg.xml");
		 //Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 Transaction beginTransaction = openSession.beginTransaction();
		 openSession.saveOrUpdate(student);
		 beginTransaction.commit();
		 openSession.close();
		 factory.close();
		 return 0;
	}


	public void deleteStudent(Student student) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 Transaction beginTransaction = openSession.beginTransaction();
		 openSession.delete(student);
		 beginTransaction.commit();
		 openSession.close();
	     factory.close();
	}


	public Student getStudent(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 //Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 return (Student)openSession.get(Student.class, id);
	}


	public Student getStudentById(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		 //Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 Criteria createCriteria = openSession.createCriteria(Student.class);
		 Criterion eq = Restrictions.eq("id",id);
		 createCriteria.add(eq);
		 return (Student) createCriteria.uniqueResult();
	}


	public void createStudentTest(Student student) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		 //Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 Transaction beginTransaction = openSession.beginTransaction();
		 openSession.saveOrUpdate(student);
		 beginTransaction.commit();
	}
	
	
	
	
}
