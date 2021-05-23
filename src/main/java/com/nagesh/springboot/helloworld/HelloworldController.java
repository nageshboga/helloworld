package com.nagesh.springboot.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@Autowired
	Environment environment ;
	@GetMapping("/helloworld") 
	
	
	public String helloworld() {
		String port = environment.getProperty("local.server.port");
		String host = environment.getProperty("HOSTNAME");
		return "<h1>V3 -- Hello Nagesh.. Welcome to hello world.."+host+"-->"+ port+"</h1>";
	}
	
	
	@GetMapping("/") 
	public String hello() {
		String host = environment.getProperty("HOSTNAME");
		String port = environment.getProperty("local.server.port");
		return "<h1>V3 --  Hello Nagesh.. Welcome .."+host+"-->"+ port+"</h1>";
	}

}
