package com.sandeep.validation;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.validation.vo.Address;
import com.sandeep.validation.vo.Person;

@RestController
public class EndPoint {
	
	
	@Autowired
	Address myAddress;
		
	@Autowired
	Person get10Year;
	
	@Autowired
	@Qualifier("get20Year")
	Person aPerson;
	
	
	@Autowired
	List<Person> listOfPersons;
	
	@GetMapping("/sayhello")
	public String sayHello() {
		System.out.println(" myAddress "+myAddress.getStreetAddress());
		System.out.println(" a 10 year "+get10Year.getAge());
		System.out.println(" a 20 year old  "+aPerson.getAge());
		System.out.println(" person list size : "+listOfPersons.size());
		return "Hello world";
	}
	
	@PostMapping(path="/sayhello" , consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public String savePerson(@RequestBody @Valid Person person) {
		System.out.println(" person "+person.getAge());
		return "Saved!"+person.getAge();
	}

}
