package com.manash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.manash.command.StudentCommand;
import com.manash.dto.StudentDTO;
import com.manash.service.StudentService;

public class StudentRegisterController extends SimpleFormController {
	private StudentService service;
	static {
		System.out.println("StudentRegisterController::static block");
	}
	public StudentRegisterController(StudentService service) {
		this.service = service;
		System.out.println("StudentRegisterController::Constructor");
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("onSubmit() method");
		StudentDTO dto=new StudentDTO();
		//copy command class object data to dto 
		StudentCommand cmd=(StudentCommand)command;
		BeanUtils.copyProperties(cmd, dto);
		//invoke service class b.method
		String result=service.registerStudent(dto);
		//create MAV object
		ModelAndView mav=new ModelAndView();
		mav.addObject("result", result);
		mav.setViewName(getSuccessView());
		return mav;
	}//onSubmit()

	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("double_posting");
	}
}
