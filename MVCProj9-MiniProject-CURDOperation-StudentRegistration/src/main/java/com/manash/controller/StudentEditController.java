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

public class StudentEditController extends SimpleFormController {
	private StudentRegisterService service;
	
	public StudentEditController(StudentRegisterService service) {
		this.service = service;
	}

	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		//read form data
		int regNo=Integer.parseInt(req.getParameter("regNo"));
		//invoke b.mehtod
		StudentDTO dto=null;
		dto=service.getStudByRegNO(regNo);
		//create command class object
		StudentRegisterCommand cmd=new StudentRegisterCommand();
		//copy data from dto class object to command class object
		BeanUtils.copyProperties(dto, cmd);
		//return command class object
		return cmd;
	}
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		List<StudentDTO> listDTO=null;
		//copy data from command obj to dto obj
		StudentDTO dto =new StudentDTO();
		StudentRegisterCommand cmd=(StudentRegisterCommand)command;
		BeanUtils.copyProperties(cmd, dto);
		//invoke b.method
		String msg=service.modifyStudentByRegNo(dto);
		listDTO=service.getAllStudent();
		//keep data into mav object
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
