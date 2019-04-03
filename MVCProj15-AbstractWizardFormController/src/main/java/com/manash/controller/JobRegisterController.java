package com.manash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.manash.command.RegisterCommand;

public class JobRegisterController extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
	   //type cast to command class object
		RegisterCommand cmd=(RegisterCommand)command;
		//return ModelAndView Object
		return new ModelAndView("result","cmd",cmd);
	}
	
	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		//return ModelAndView Object
		return new ModelAndView("register");
	}
}
