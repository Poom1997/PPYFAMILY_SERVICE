package com.ppyfamily.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${STRING}")
	private String testString;

	@GetMapping("hello")
	public String helloWorld(){
		return testString;
	}
}
