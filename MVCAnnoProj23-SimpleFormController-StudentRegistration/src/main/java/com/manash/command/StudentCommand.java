package com.manash.command;

import lombok.Data;

@Data
public class StudentCommand {
	
	private String sname;
	private String addr;
	private String   gender;
	private String course;
	private Long   mob;
	private String email;
	private String vflag;

	public StudentCommand() {
		System.out.println("Command class constructor");
		gender="M";
		vflag="no";
	}               
}
