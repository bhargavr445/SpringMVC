package com.project.entites;

public class Employee {
	private int id;
	private String employee_name;
	private float employee_sal;
	private int employee_age;
	private String profile_image;
	
	public Employee() {
		
	}
	
	public Employee(int id, String employee_name, float employee_sal, int employee_age, String profile_image) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employee_sal = employee_sal;
		this.employee_age = employee_age;
		this.profile_image = profile_image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public float getEmployee_sal() {
		return employee_sal;
	}
	public void setEmployee_sal(float employee_sal) {
		this.employee_sal = employee_sal;
	}
	public int getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(int employee_age) {
		this.employee_age = employee_age;
	}
	
	
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employee_name=" + employee_name + ", employee_sal=" + employee_sal
				+ ", employee_age=" + employee_age + ", profile_image=" + profile_image + "]";
	}

	
//	public int compareTo(Employee o) {
//		if(this.employee_sal==getEmployee_sal()) {
//			return 0;
//		}
//		else if(this.employee_sal>getEmployee_sal()){
//			return -1;
//		}
//		return 1;
//	}
	
	
}
