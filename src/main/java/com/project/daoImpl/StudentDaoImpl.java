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
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.StudentDao;
import com.project.entites.Student;

@Repository
//@Transactional
public class StudentDaoImpl implements StudentDao{
//	Map<Long, Student> students = new HashMap<Long, Student>();
//	Configuration configuration = new Configuration();
//	configuration.configure("hibernate.cfg.xml");
//	
//	//Create session factory instance
//	 SessionFactory factory = configuration.buildSessionFactory();
//	@Autowired
//	SessionFactory sessionFactory;
	//Student student;
	
	StudentDaoImpl(){
		Map<Long, Student> students = new HashMap<Long, Student>();
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//Create session factory instance
		 
		
	}
	

//	public List<Student> getAllStudents(int id) {
////		Student student = new Student();
////		student.setId(id);
////		student.setEmail("bhargav@gmail.com");
////		student.setfName("Bhargav Ram");
////		student.setlName("Guntaka");
////		students.put((long) student.getId(), student);
////		return student;
//		Session session = sessionFactory.openSession();
//		List<Student> personList = session.createQuery("from Person").list();
//		session.close();
//		return personList;
//	}
//	}

	public boolean update(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Student student) {
		// TODO Auto-generated method stub
		return false;
	}


//	public int createStudent(Student student) {
//		students.put((long) student.getId(), student);
//		System.out.println(students.size());
//		return 1;
//	}


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
		//configuration.addAnnotatedClass(Student.class);
		//Session openSession = sessionFactory.getCurrentSession();
		
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
		 
		 
		// TODO Auto-generated method stub
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
