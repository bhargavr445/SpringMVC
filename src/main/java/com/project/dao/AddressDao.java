package com.project.dao;

import com.project.entites.Address;

public interface AddressDao {

	public Address getAddresById(int id);

	public void deleteStudent(int id, Address address);
	

}
