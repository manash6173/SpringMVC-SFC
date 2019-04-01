package com.manash.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.manash.command.EmployeeCommand;

public class RegisterController extends SimpleFormController {
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		EmployeeCommand cmd=(EmployeeCommand)command;
		
		return new ModelAndView(getSuccessView(),"empCmd",cmd);
	}
	
	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		//create SimpleDateForamt class object to specify the date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		//create custom editor class object
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));		
	}
}
