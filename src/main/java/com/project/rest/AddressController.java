package com.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.entites.Address;
import com.project.exception.AddressNotFoundException;
import com.project.service.AddressService;

@RestController
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="getAddressById/{id}", method=RequestMethod.GET)
	public Address getAddressById(@PathVariable int id) {
		Address addressById = addressService.getAddressById(id);
//		if(addressById==null) {
//		throw new AddressNotFoundException("Address Not Found");
//		}
		return addressById;
	}
	
	@RequestMapping(value="deleteStudent/{id}", method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable int id, @RequestBody Address address) {
		addressService.deleteStudent(id, address);
	}

}
