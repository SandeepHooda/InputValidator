package com.sandeep.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sandeep.validation.vo.Address;
import com.sandeep.validation.vo.Person;

@SpringBootApplication
public class ValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
	}
	
	@Bean
	public Address getAddress1() {
		Address a = new Address();
		a.setStreetAddress(" add 1");
		return a;
	}

	@Bean
	public Person get10Year() {
		Person p = new Person();
		p.setAge(10);
		return p;
	}
	
	@Bean
	public Person get20Year() {
		Person p = new Person();
		p.setAge(20);
		return p;
	}
	

	
	
}
