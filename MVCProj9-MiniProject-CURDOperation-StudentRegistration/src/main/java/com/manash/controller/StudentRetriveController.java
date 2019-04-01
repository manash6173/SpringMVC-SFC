package com.manash.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.manash.dto.StudentDTO;
import com.manash.service.StudentRegisterService;

public class StudentRetriveController extends AbstractController {
	private StudentRegisterService service;

	public StudentRetriveController(StudentRegisterService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		//use service object
		List<StudentDTO> listDTO=null;
		listDTO=service.getAllStudent();
		System.out.println(listDTO);
		//return MAV object
		return new ModelAndView("student_list","studentList",listDTO);
	}
}
