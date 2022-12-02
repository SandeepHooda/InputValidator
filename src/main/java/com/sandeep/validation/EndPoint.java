package com.sandeep.validation;



import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.validation.vo.Person;

@RestController
public class EndPoint {
	
	@GetMapping("/sayhello")
	public String sayHello() {
		return "Hello world";
	}
	
	@PostMapping(path="/sayhello" , consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public String savePerson(@RequestBody @Valid Person person) {
		System.out.println(" person "+person.getAge());
		return "Saved!"+person.getAge();
	}

}
