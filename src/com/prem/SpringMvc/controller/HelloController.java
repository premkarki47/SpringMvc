package com.prem.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping("/")
	public String getAll() {
		
		return "home";
	}
	
	@RequestMapping("/ok")
	public String setAll() {
		
		return "index";
	}
	}

