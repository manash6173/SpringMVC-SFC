package com.manash.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.manash.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String ADD_STUDENT="INSERT INTO STUDENTREGISTER VALUES(REGNO.NEXTVAL,?,?,?,?,?,?)";
	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
		System.out.println("StudentDAOImpl::Constructor");
	}

	@Override
	public int addStudent(StudentBO bo) {
		//use jt
		int result=jt.update(ADD_STUDENT, bo.getSname(),bo.getAddr(),bo.getGender(),bo.getCourse(),bo.getMob(),bo.getEmail());
		return result;
	}
}
