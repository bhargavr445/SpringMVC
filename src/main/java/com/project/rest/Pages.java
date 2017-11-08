package com.project.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="pages")
public class Pages {

	@RequestMapping(value="/parentPage")
	public ModelAndView getParent() {
		ModelAndView mv = new ModelAndView("parent");
		return mv;
	}
	
	@RequestMapping(value="/studentPage")
	public ModelAndView getStudent() {
		ModelAndView mv = new ModelAndView("student");
		return mv;
	}
}
