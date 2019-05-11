package com.manash.dao;

import java.util.List;

import com.manash.bo.EmployeeBO;
import com.manash.bo.EmployeeResultBO;

public interface EmployeeDAO {
	public List<EmployeeResultBO> getEmpDetails(EmployeeBO bo);

}
