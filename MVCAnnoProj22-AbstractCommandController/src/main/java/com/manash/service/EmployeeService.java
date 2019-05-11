package com.manash.service;

import java.util.List;

import com.manash.bo.EmployeeResultBO;
import com.manash.dto.EmployeeDTO;
import com.manash.dto.EmployeeResultDTO;

public interface EmployeeService {
	public List<EmployeeResultDTO> fetchEmpDetails(EmployeeDTO dto);

}
