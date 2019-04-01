package com.manash.service;

import java.util.List;

import com.manash.dto.StudentDTO;

public interface StudentRegisterService {
	public List<StudentDTO> getAllStudent();
	public StudentDTO getStudByRegNO(int regNo);
	public String modifyStudentByRegNo(StudentDTO dto);
	public String deleteStudentByRegNo(int regNo);
	public String registerStudent(StudentDTO dto);

}
