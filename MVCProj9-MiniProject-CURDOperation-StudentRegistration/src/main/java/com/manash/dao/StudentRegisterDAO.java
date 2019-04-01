package com.manash.dao;

import java.util.List;

import com.manash.bo.StudentBO;

public interface StudentRegisterDAO {
	public List<StudentBO> fetchRegisterStudent();
	public StudentBO fetchStudentByRegNo(int regNo);
	public int updateStudentById(StudentBO bo);
	public int deleteStudentById(int regNo);
	public int addStudent(StudentBO bo);
	

}
