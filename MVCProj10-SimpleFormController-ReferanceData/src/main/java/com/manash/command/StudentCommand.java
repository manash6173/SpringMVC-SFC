package com.manash.command;

import lombok.Data;

@Data
public class StudentCommand {
	private String sname;
	private String addr;
	private String gender="male";
	private String country;
	private String courses[];
	private String hobies[];

}
