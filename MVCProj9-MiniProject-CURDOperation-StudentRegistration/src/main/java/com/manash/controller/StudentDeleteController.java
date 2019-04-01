package com.manash.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.manash.dto.StudentDTO;
import com.manash.service.StudentRegisterService;

public class StudentDeleteController extends AbstractController {
	private StudentRegisterService service;

	public StudentDeleteController(StudentRegisterService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<StudentDTO> listDTO=null;
		//read form data
		int regNo=Integer.parseInt(request.getParameter("regNo"));
		//invoke service class method
		String msg=service.deleteStudentByRegNo(regNo);
		listDTO=service.getAllStudent();
		//create MAV object
		ModelAndView mav=new ModelAndView();
		mav.addObject("studentList", listDTO);
		mav.addObject("msg", msg);
		mav.setViewName("student_list");
		return mav;
	}

}
