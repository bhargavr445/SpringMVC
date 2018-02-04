package com.project.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//@CrossOrigin(origins = {"http://localhost:8585"}, maxAge = 4800, allowCredentials = "false")

@RestController
//@RequestMapping(value="pages")
public class Pages {

	@RequestMapping(value="/parentPage")
	public ModelAndView getParent() {
		return new ModelAndView("parent");
		 
	}
	
	@RequestMapping(value="/studentPage")
	public ModelAndView getStudent() {
		return new ModelAndView("student");
		
	}
}
