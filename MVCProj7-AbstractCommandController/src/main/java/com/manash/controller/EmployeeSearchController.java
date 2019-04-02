package com.manash.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.manash.command.EmployeeCommand;
import com.manash.dto.EmployeeDTO;
import com.manash.dto.EmployeeResultDTO;
import com.manash.service.EmployeeService;

public class EmployeeSearchController extends AbstractCommandController {
	private EmployeeService service;

	
	public EmployeeSearchController(EmployeeService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		EmployeeDTO dto=null;
		List<EmployeeResultDTO> listRdto=null;	
		EmployeeCommand ec=(EmployeeCommand)command;
		//use service
		//copy data from command class object to employee dto
		dto=new EmployeeDTO();
		dto.setEmpno(ec.getTempno());
		dto.setEname(ec.getTename());
		dto.setDeptNo(ec.getTdeptno());
		//use service
		listRdto=service.fetchEmpDetails(dto);
		//create MAV object
		ModelAndView mav=new ModelAndView();
		mav.addObject("empDetails", listRdto);
		mav.setViewName("result");
		return mav;
	}

}
