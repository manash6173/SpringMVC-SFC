package com.manash.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manash.command.EmployeeCommand;
import com.manash.dto.EmployeeDTO;
import com.manash.dto.EmployeeResultDTO;
import com.manash.service.EmployeeService;

@Controller
public class EmployeeSearchController {
	
	@Autowired
	private EmployeeService service;

	@RequestMapping(value="/employee.do",method= {RequestMethod.POST})
	public String searchEmp(Map<String,Object> model,@ModelAttribute EmployeeCommand command) {
		EmployeeDTO dto=null;
		List<EmployeeResultDTO> listRdto=null;	
		//use service
		//copy data from command class object to employee dto
		dto=new EmployeeDTO();
		dto.setEmpno(command.getTempno());
		dto.setEname(command.getTename());
		dto.setDeptNo(command.getTdeptno());
		//use service
		listRdto=service.fetchEmpDetails(dto);
		model.put("empDetails", listRdto);
		return "result";
	}
	
	@RequestMapping("/search.do")
	public String showHome() {
		return "search";
	}

}
