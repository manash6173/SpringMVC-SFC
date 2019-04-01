package com.manash.command;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeCommand implements Serializable{
	
	private Integer empNo;
	private String ename;
	private String job;
	private Date dob;
	private Date doj;
	private Date dom;
	
}
