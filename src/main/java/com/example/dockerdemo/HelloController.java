package com.example.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HelloController {
	@Autowired
	private HelloWorld helloWorld;
	@GetMapping("/hello")
	public String hello() {
		 
		helloWorld.printSystemProperies();
		return "Printed System Properties in console";
	}
}
