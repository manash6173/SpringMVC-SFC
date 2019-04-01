package com.manash.service;

import org.springframework.beans.BeanUtils;

import com.manash.bo.StudentBO;
import com.manash.dao.StudentDAO;
import com.manash.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
		System.out.println("Service class constructor");
	}

	@Override
	public String registerStudent(StudentDTO dto) {
		String msg=null;
		StudentBO bo=new StudentBO();
		//convert dto to bo object
		BeanUtils.copyProperties(dto, bo);
		//use dao
		int result=dao.addStudent(bo);
		if(result==0)
			msg="Student Registration failed";
		else 
			msg="Student Registration Successful";
		return msg;
	}

}
