package com.br.fluencynow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home_controller {

	/**
	 * View da HomePage
	 * */
	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
}