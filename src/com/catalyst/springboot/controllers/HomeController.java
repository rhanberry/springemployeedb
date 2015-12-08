package com.catalyst.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "/employee-index.html";
	}

	@RequestMapping(value = "/update-e", method = RequestMethod.GET)
	public String update(){
		return "/employee-update.html";
	}
	
	@RequestMapping(value = "/remove-e", method = RequestMethod.GET)
	public String remove(){
		return "/employee-delete.html";
	}
	
	@RequestMapping(value = "/create-e", method = RequestMethod.GET)
	public String create(){
		return "/employee-create.html";
	}

}
