package com.manash.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentDTO implements Serializable{
	private String sname;
	private String addr;
	private String gender;
	private String course;
	private Long mob;
	private String email;
}
