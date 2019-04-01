package com.manash.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import com.manash.command.StudentRegisterCommand;

public class RegisterFormValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz==StudentRegisterCommand.class;
	}

	@Override
	public void validate(Object target, Errors errors) {
		//type cast to command class object
		StudentRegisterCommand cmd=(StudentRegisterCommand)target;
		
if(cmd.getVflag().equalsIgnoreCase("yes")) {
		System.out.println("validate if block executed");
		//validate properties
		if(cmd.getName()=="" || cmd.getName()==null) 
		  errors.rejectValue("name","name.required");
		else if(cmd.getName().length()>20)
			errors.rejectValue("name", "name.len");
		else if(!cmd.getName().equals(cmd.getName().toUpperCase()))
			errors.rejectValue("name", "name.uppercase");
		
		if(cmd.getAddr()=="" || cmd.getAddr()==null) 
			  errors.rejectValue("addr","addr.required");
		else if(cmd.getAddr().length()>20)
			errors.rejectValue("addr", "addr.len");
		
	     
		if(cmd.getCourse()=="" || cmd.getCourse()==null) 
			  errors.rejectValue("course","course.required");
		else if(cmd.getCourse().length()>20)
			errors.rejectValue("course", "course.len");
		
			
		if(cmd.getMobileNo()==null) 
			  errors.rejectValue("mobileNo","mobileNo.required");
		else if(cmd.getMobileNo().toString().length()!=10)
			errors.rejectValue("mobileNo","mobileNo.len");
		else if(cmd.getMobileNo().toString().contains("abcdef"))
			errors.rejectValue("mobileNo","mobileNo.char");
		
		if(cmd.getEmail()=="" || cmd.getEmail()==null) 
			  errors.rejectValue("email","email.required");
		else if(cmd.getEmail().length()>20)
			errors.rejectValue("email", "email.len");
		else if(!cmd.getEmail().endsWith("@gmail.com")) {
			errors.rejectValue("email","email.val");
		}
	  }
	}//if 

}
