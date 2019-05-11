package com.manash.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class EmployeeResultDTO extends EmployeeDTO implements Serializable{
	private int srlno;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	
}
