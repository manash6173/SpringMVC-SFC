package com.manash.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.manash.command.StudentCommand;

public class RegisterFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("RegisterFormValidator.validate()");
		  //type cast to command class object
		StudentCommand cmd=(StudentCommand)target;
		//validate properties
		if(cmd.getSname().length()==0 || cmd.getSname()==null )
			errors.rejectValue("sname", "sname.required");
		else if(cmd.getSname().length()>20)
			errors.rejectValue("sname", "sname.minlen");
		if(cmd.getAddr().length()==0 || cmd.getAddr()==null )
			errors.rejectValue("addr", "addr.required");
		else if(cmd.getAddr().length()>20)
			errors.rejectValue("addr", "addr.minlen");
		
		if(cmd.getCountry().equalsIgnoreCase("--select--"))
			errors.rejectValue("country", "country.required");
		
	}

}
