package com.manash.bo;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeResultBO extends EmployeeBO {

	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;

}
