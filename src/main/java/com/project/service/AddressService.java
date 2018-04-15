package com.project.service;

import com.project.entites.Address;

public interface AddressService {
	public Address getAddressById(int id);

	public void deleteStudent(int id, Address address);

}
