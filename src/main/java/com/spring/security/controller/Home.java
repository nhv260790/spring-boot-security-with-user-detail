package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/")
public class Home {

	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("home")
	public String home() {
		return "This is home page";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "detail";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
}
