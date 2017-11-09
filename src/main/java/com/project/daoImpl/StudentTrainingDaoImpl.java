package com.project.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

}
