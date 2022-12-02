package com.sandeep.validation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoint {
	
	@GetMapping("/sayhello")
	public String sayHello() {
		return "Hello world";
	}

}
