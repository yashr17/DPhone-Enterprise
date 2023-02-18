package com.dphone.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dphone.webapp.service.WebAppServiceImpl;

@RequestMapping("/")
@RestController
public class WebController {
	
	@Autowired
	WebAppServiceImpl webAppServiceImpl;
	
	@GetMapping("/")
	public ModelAndView homeView() {
		ModelAndView homeView = new ModelAndView();
		return homeView;
	}
	
	@GetMapping("/register")
	public ModelAndView registerView() {
		ModelAndView registerView = new ModelAndView();
		return registerView;
	}
	
//	@PostMapping("/login")
//	public 
}
