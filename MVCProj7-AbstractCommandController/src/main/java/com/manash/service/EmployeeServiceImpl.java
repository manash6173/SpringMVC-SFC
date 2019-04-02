package com.manash.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.manash.bo.EmployeeBO;
import com.manash.bo.EmployeeResultBO;
import com.manash.dao.EmployeeDAO;
import com.manash.dto.EmployeeDTO;
import com.manash.dto.EmployeeResultDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;

	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeResultDTO> fetchEmpDetails(EmployeeDTO dto) {
		List<EmployeeResultDTO> listRDTO=new ArrayList<EmployeeResultDTO>();
		List<EmployeeResultBO> listRBO=null;
		EmployeeBO bo=new EmployeeBO();
		
		//convert EmployeeDTO to EmployeeBO
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		listRBO=dao.getEmpDetails(bo);
		//copy listRBO to listRDTO
		listRBO.forEach(rbo->{
			EmployeeResultDTO rdto=new EmployeeResultDTO();
			BeanUtils.copyProperties(rbo,rdto);
			rdto.setSrlno(listRDTO.size()+1);
			listRDTO.add(rdto);
			});
		return listRDTO;
	}//end method
}//end class
