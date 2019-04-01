package com.manash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manash.bo.StudentBO;

public class StudentRegisterDAOImpl implements StudentRegisterDAO {
	private static final String GET_ALL_STUDENT="SELECT * FROM STUDENTREGISTER"; 
	private static final String GET_STUD_BY_REGNO="SELECT * FROM STUDENTREGISTER WHERE REGISTERNO=?";
	private static final String UPDATE_STUDENT_BY_REGNO="UPDATE STUDENTREGISTER SET NAME=?,ADDRESS=?,GENDER=?,COURSE=?,MOBILENO=?,EMAIL=? WHERE REGISTERNO=?";
	private static final String DELETE_STUDENT_BY_REGNO="DELETE FROM STUDENTREGISTER WHERE REGISTERNO=?";
	private static final String ADD_STUDENT="INSERT INTO STUDENTREGISTER VALUES(REGNO.NEXTVAL,?,?,?,?,?,?)";
	private JdbcTemplate jt;
	
	public StudentRegisterDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<StudentBO> fetchRegisterStudent() {
		
		List<StudentBO> listBO=jt.query(GET_ALL_STUDENT, new ResultSetExtractor<List<StudentBO>>() {

			@Override
			public List<StudentBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			  //customize records
			 StudentBO bo=null;
			 List<StudentBO> listBO=new ArrayList<StudentBO>();
			 while(rs.next()) {
				 bo=new StudentBO();
				 bo.setRegNo(rs.getInt(1));
				 bo.setName(rs.getString(2));
				 bo.setAddr(rs.getString(3));
				 bo.setGender(rs.getString(4));
				 bo.setCourse(rs.getString(5));
				 bo.setMobileNo(rs.getLong(6));
				 bo.setEmail(rs.getString(7));
				 listBO.add(bo);
			 }
				return listBO;
			}
		});
		return listBO;
	}

	@Override
	public StudentBO fetchStudentByRegNo(int regNo) {
		//invoke query method
		StudentBO bo=jt.queryForObject(GET_STUD_BY_REGNO,
				(rs,rowNo)->{
					StudentBO bo1=new StudentBO();
					 bo1.setRegNo(rs.getInt(1));
					 bo1.setName(rs.getString(2));
					 bo1.setAddr(rs.getString(3));
					 bo1.setGender(rs.getString(4));
					 bo1.setCourse(rs.getString(5));
					 bo1.setMobileNo(rs.getLong(6));
					 bo1.setEmail(rs.getString(7));
					 return bo1;
				},
				regNo);	
		return bo;
	}
	@Override
	public int updateStudentById(StudentBO bo) {
		//use jt
		int count=jt.update(UPDATE_STUDENT_BY_REGNO, bo.getName(),bo.getAddr(),bo.getGender(),bo.getCourse(),bo.getMobileNo(),bo.getEmail(),bo.getRegNo());
		return count;
	}

	@Override
	public int deleteStudentById(int regNo) {
		//use jt
		int count=jt.update(DELETE_STUDENT_BY_REGNO, regNo);
		return count;
	}
	
	@Override
	public int addStudent(StudentBO bo) {
		//use jt
		int result=jt.update(ADD_STUDENT, bo.getName(),bo.getAddr(),bo.getGender(),bo.getCourse(),bo.getMobileNo(),bo.getEmail());
		return result;
	}
}
