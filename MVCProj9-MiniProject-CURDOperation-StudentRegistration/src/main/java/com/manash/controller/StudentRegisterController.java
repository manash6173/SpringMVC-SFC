package com.manash.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.manash.command.StudentRegisterCommand;
import com.manash.dto.StudentDTO;
import com.manash.service.StudentRegisterService;


public class StudentRegisterController extends SimpleFormController {
	private StudentRegisterService service;
	public StudentRegisterController(StudentRegisterService service) {
		super();
		this.service = service;
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentDTO dto=new StudentDTO();
		//copy command class object data to dto 
		StudentRegisterCommand cmd=(StudentRegisterCommand)command;
		BeanUtils.copyProperties(cmd, dto);
		//invoke service class b.method
		String msg=service.registerStudent(dto);
		List<StudentDTO> listDTO=service.getAllStudent();
		//create MAV object
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList", listDTO);
		mav.addObject("msg", msg);
		mav.setViewName(getSuccessView());
		return mav;
	}
	
	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return new ModelAndView("double_posting");
	}


}
