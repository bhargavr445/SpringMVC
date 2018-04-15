package com.project.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="demo")
public class DemoController {
	
	@RequestMapping(value="getAllStudents/{studentName}", method=RequestMethod.GET)
	public String  getAllStudents(@PathVariable String studentName) {
		return studentName;
	}
	
}
