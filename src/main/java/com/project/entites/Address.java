package com.project.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="Address")
public class Address {
	//@Id
	//@GeneratedValue
	private int id;
	
	//@Column(name="street")
	private String street;
	
	//@Column(name="apt")
	private String apt;
	
	//@Column(name="city")
	private String city;
	
	//@Column(name="county")
	private String county;
	

	//@Column(name="state")
	private String state;
	
	//@Column(name="zip")
	private String zip;
	
	public Address() {
		
	}
	

	public Address(int id, String street, String apt, String city, String county, String state, String zip) {
		super();
		this.id = id;
		this.street = street;
		this.apt = apt;
		this.city = city;
		this.county = county;
		this.state = state;
		this.zip = zip;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", apt=" + apt + ", city=" + city + ", county=" + county
				+ ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
}
