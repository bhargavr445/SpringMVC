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
	
	StudentDaoImpl(){
		Map<Long, Student> students = new HashMap<Long, Student>();
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance	
	}
	


	public boolean update(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Student student) {
		
		// TODO Auto-generated method stub
		return false;
	}

	public Student getAllStudents(int id) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		 //Create session factory instance
		 SessionFactory factory = configuration.buildSessionFactory();
		 Session openSession = factory.openSession();
		 //Transaction beginTransaction = openSession.beginTransaction();
		 Student student = (Student)openSession.get(Student.class, id);
		 //beginTransaction.commit();
		 return student;
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
		 Student uniqueResult = (Student) createCriteria.uniqueResult();
		 //Student student = (Student) openSession.get(Student.class, id);
		 return uniqueResult;
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
