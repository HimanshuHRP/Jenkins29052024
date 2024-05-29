package com.zensarr.sample_app_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return"<h1> Welcome to Jenkins and Say Hello </h1>";
	}

	@RequestMapping("/bye")
	public String sayBye() {
		return"<h1> Good Byee </h1>";
	}
}
