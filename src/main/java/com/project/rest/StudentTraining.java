package com.project.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="studentTraining")
public class StudentTraining {
	
	
	@RequestMapping(value="/testdata", method=RequestMethod.GET)
	public void getData(){
		String name="bhargav";
	}
	

}
