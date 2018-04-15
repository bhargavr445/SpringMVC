package com.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.dao.AddressDao;
import com.project.entites.Address;
import com.project.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;
	public Address getAddressById(int id) {
		Address addres=addressDao.getAddresById(id);
		return addres;
	}
	
	public void deleteStudent(int id, Address address) {
		addressDao.deleteStudent(id, address);
		
	}

}
