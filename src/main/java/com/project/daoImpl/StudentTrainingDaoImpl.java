package com.project.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import com.project.dao.StudentTrainingDao;
import com.project.entites.Student;
import com.project.entites.StudentTraining;

@Repository
public class StudentTrainingDaoImpl implements StudentTrainingDao {

	public List<StudentTraining> getAllStudents() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		List<StudentTraining> stuList=openSession.createQuery("from Student").list();
		return stuList;
	}

	public Student getStudentById(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Student st = (Student) openSession.get(Student.class, id);
		return st;
	}

	public List<Integer> getAllId() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		List<Integer> list = openSession.createQuery("select id from Student").list();
		return list;
	}

	public void deleteStudent(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		//openSession.delete(id, Student.class);
		//openSession.
		Student ent = (Student) openSession.load(Student.class, id);
		openSession.delete(ent);
		beginTransaction.commit();
		openSession.close();
		factory.close();
	}

	public void updateStudent(Student student) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.saveOrUpdate(student);
		beginTransaction.commit();
		openSession.close();
		factory.close();
		
	}

	public List<String> getStudentNamesList() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Criteria criteria = openSession.createCriteria(Student.class);
		criteria.setProjection(Projections.property("fName"));
		List<String> list = criteria.list();
		return list;
	}

	public void createStudent(Student stu) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Serializable save = openSession.save(stu);
		beginTransaction.commit();
		openSession.close();
		factory.close();
	}

	public void deleteStudentByObj(int id) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		//int id= stu.getId();
		Student ent = (Student) openSession.load(Student.class, id);
		openSession.delete(ent);
		beginTransaction.commit();
		openSession.close();
		factory.close();
		
	}
	
//	@Override
//	public void editStudentByObj(int id) {
//		// TODO Auto-generated method stub
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		SessionFactory factory = configuration.buildSessionFactory();
//		Session openSession = factory.openSession();
//		Transaction beginTransaction = openSession.beginTransaction();
//		//int id= stu.getId();
//		Student ent = (Student) openSession.load(Student.class, id);
//		openSession.delete(ent);
//		beginTransaction.commit();
//		openSession.close();
//		factory.close();
//		
//	}
	
}
