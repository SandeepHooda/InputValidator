package com.sandeep.validation.vo;

import com.sandeep.validation.constraint.ValidPerson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ValidPerson
public class Person {
	
	private int age;
	private Address address;
	private Education education;

}
