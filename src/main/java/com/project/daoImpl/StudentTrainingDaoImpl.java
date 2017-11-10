package com.project.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
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
	
	
	

}
