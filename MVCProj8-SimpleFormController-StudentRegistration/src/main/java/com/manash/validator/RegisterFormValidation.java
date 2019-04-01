package com.manash.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.manash.command.StudentCommand;

public class RegisterFormValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz==StudentCommand.class;
	}

	@Override
	public void validate(Object target, Errors errors) {
		//type cast to command class object
		StudentCommand cmd=(StudentCommand)target;
		
if(cmd.getVflag().equalsIgnoreCase("no")) {
			System.out.println("validate if block executed");
		//validate properties
		if(cmd.getSname()=="" || cmd.getSname()==null) 
		  errors.rejectValue("sname","sname.required");
		else if(cmd.getSname().length()>20)
			errors.rejectValue("sname", "sname.len");
		
		if(cmd.getAddr()=="" || cmd.getAddr()==null) 
			  errors.rejectValue("addr","addr.required");
		else if(cmd.getAddr().length()>20)
			errors.rejectValue("addr", "addr.len");
		
	     
		if(cmd.getCourse()=="" || cmd.getCourse()==null) 
			  errors.rejectValue("course","course.required");
		else if(cmd.getCourse().length()>20)
			errors.rejectValue("course", "course.len");
		
			
		if(cmd.getMob()==null) 
			  errors.rejectValue("mob","mob.required");
		else if(cmd.getMob().toString().length()!=10)
			errors.rejectValue("mob","mob.len");
		else if(cmd.getMob().toString().contains("abcdef"))
			errors.rejectValue("mob","mob.char");
		
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
