package com.manash.command;

import lombok.Data;

@Data
public class RegisterCommand {
	//Form paga1 data
	private String firstName;
	private String lastName;
	private String email;
	private Long mob;
	//Form page2 data
	private String domain;
	private String location;
	private Integer experience;
	//Form page3 data
	private Float currentSal;
	private Float expectedSal;
	
}
