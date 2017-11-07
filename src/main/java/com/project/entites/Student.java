package com.project.entites;

import javax.persistence.Column;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;


//@Entity
//@Table(appliesTo = "student")
public class Student {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "studentId")
	private int id;
	//@Column(name = "fname")
	private String fName;
	//@Column(name = "lName")
	private String lName;
	//@Column(name = "email")
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}
