package com.manash.command;

import lombok.Data;

@Data
public class StudentRegisterCommand {
	
	private int regNo;
	private String name;
	private String addr;
	private String gender;
	private String course;
	private Long mobileNo;
	private String email;
	private String vflag;

}
