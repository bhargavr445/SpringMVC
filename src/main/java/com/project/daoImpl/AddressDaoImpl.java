package com.project.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import com.project.entites.Address;
import com.project.exception.AddressNotFoundException;
import com.project.dao.AddressDao;
@Repository
public class AddressDaoImpl implements AddressDao {

	
	public Address getAddresById(int id) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Address  address = (Address)openSession.get(Address.class, id);
		return address;
	}

	public void deleteStudent(int id, Address address) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//Create session factory instance
		SessionFactory factory = configuration.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.delete(Address.class);
		beginTransaction.commit();
	}

}
