package com.project.ws;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.entites.Employee;

@Service
public class StudentClient {
	
	public Employee getById() throws JsonParseException, JsonMappingException, IOException {
		String s =ClientBuilder.newClient().target("http://dummy.restapiexample.com/api/v1/employee/1").request().get(String.class);
		ObjectMapper o = new ObjectMapper();
		o.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Employee e = o.readValue(s, Employee.class);
		System.out.println(e.getEmployee_age());
		System.out.println(e.getEmployee_name());
		System.out.println(e.getEmployee_sal());
		System.out.println(e.getId());
		return e;
	}

	public Employee[] getAllStudents() throws JsonParseException, JsonMappingException, IOException {
		Client newClient = ClientBuilder.newClient();
		WebTarget target = newClient.target("http://dummy.restapiexample.com/api/v1/employees");
		String string = target.request().get(String.class);
		ObjectMapper o = new ObjectMapper();
		o.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		 Employee[] readValue = o.readValue(string, Employee[].class);
		return readValue;
	}
	
	public void createEmployee(Employee emp) throws JsonParseException, JsonMappingException, IOException {
		Client newClient = ClientBuilder.newClient();
		WebTarget target = newClient.target("http://dummy.restapiexample.com/api/v1/create");
		Response response = target.request().post(Entity.json(emp));
				//entity(emp, MediaType.APPLICATION_JSON, Boolean.class);
		
		System.out.println(response);
		ObjectMapper o = new ObjectMapper();
		o.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
	}
	

}


//mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
////String jsonInString = mapper.writeValueAsString(employee);
//Employee empData = mapper.readValue(string, Employee.class);
////WriteValue(employee, Employee.class)
////System.out.println(empData.getAnnualSalary());
////Employee e = new Employee();
////System.out.println(e.getDepartment());
//System.out.println("Search data");