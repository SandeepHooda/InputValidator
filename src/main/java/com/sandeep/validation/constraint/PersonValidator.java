	package com.sandeep.validation.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;

import com.sandeep.validation.vo.Person;

public class PersonValidator implements ConstraintValidator<ValidPerson, Person> {
	private Person person;
	 @Override
	    public void initialize(ValidPerson constraintAnnotation) {
	    }

	    @Override
	    public boolean isValid(Person person, ConstraintValidatorContext context) {
	    	boolean isValid = ( person.getAge() > 10);
	    	if (!isValid) {
	    		((ConstraintValidatorContextImpl) context)
	             .addMessageParameter("wrongValue", person.getAge());
	    		
	    		
	    	}
	    	 
	    	return isValid;
	    }

}
