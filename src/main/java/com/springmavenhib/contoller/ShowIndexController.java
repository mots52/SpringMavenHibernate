package com.springmavenhib.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

public class ShowIndexController {

	@RequestMapping("/")
	public ModelAndView mainPage(){
		return new ModelAndView("home");
	}
	
	@RequestMapping("/index")
	public ModelAndView indexPage(){
		return new ModelAndView("home");
	}
}
