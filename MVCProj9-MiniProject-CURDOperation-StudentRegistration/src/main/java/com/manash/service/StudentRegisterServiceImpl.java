package com.manash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.manash.bo.StudentBO;
import com.manash.dao.StudentRegisterDAO;
import com.manash.dto.StudentDTO;

public class StudentRegisterServiceImpl implements StudentRegisterService {
	private StudentRegisterDAO dao;

	public StudentRegisterServiceImpl(StudentRegisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> getAllStudent() {
		//use DAO
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=new ArrayList<StudentDTO>();
		
		listBO=dao.fetchRegisterStudent();
		//copy data from listBo to listDto 
		listBO.forEach(bo1->{
			StudentDTO dto1=new StudentDTO();
			BeanUtils.copyProperties(bo1, dto1);
			dto1.setSrlNo(listDTO.size()+1);
			listDTO.add(dto1);
		});
		return listDTO;
	}

	@Override
	public StudentDTO getStudByRegNO(int regNo) {
		StudentDTO dto=new StudentDTO();
		StudentBO bo=null;
		//use dao
		bo=dao.fetchStudentByRegNo(regNo);
		//copy data from bo to dto
		BeanUtils.copyProperties(bo, dto);
		//return dto
		return dto;
	}

	@Override
	public String modifyStudentByRegNo(StudentDTO dto) {
		String msg=null;
		 //copy data from dto to bo
		 StudentBO bo=new StudentBO();
		 BeanUtils.copyProperties(dto, bo);
		 int count=dao.updateStudentById(bo);
			msg= (count==0)? "regNo not found and updation failed":"regNo found and Record Updated";
		return msg;
	}

	@Override
	public String deleteStudentByRegNo(int regNo) {
		//use dao
		int count =dao.deleteStudentById(regNo);
		return count==0?"RegNo Not found record Not Deleted":"RegNo Found And Record Successfuly deleted" ;
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
