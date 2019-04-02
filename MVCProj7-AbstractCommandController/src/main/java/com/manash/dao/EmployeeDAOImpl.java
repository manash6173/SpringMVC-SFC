package com.manash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manash.bo.EmployeeBO;
import com.manash.bo.EmployeeResultBO;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static final String GET_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO FROM EMP WHERE (EMPNO IS NOT NULL AND EMPNO=?) OR (ENAME IS NOT NULL AND ENAME=?) OR (DEPTNO IS NOT NULL AND DEPTNO=?)";
	private JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeResultBO> getEmpDetails(EmployeeBO bo) {
		List<EmployeeResultBO> listRBO=null;
		listRBO=jt.query(GET_EMP_DETAILS,
				new ResultSetExtractor<List<EmployeeResultBO>>() {

					@Override
					public List<EmployeeResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<EmployeeResultBO> listBO=new ArrayList<EmployeeResultBO>();
						EmployeeResultBO rbo=null;
						//copy results from resultset object
						while(rs.next()) {
							rbo=new EmployeeResultBO();
							rbo.setEmpno(rs.getInt(1));
							rbo.setEname(rs.getString(2));
							rbo.setJob(rs.getString(3));
							rbo.setMgr(rs.getInt(4));
							rbo.setHiredate(rs.getDate(5));
							rbo.setSal(rs.getInt(6));
							rbo.setComm(rs.getInt(7));
							rbo.setDeptNo(rs.getInt(8));
							listBO.add(rbo);
						}
						return listBO;
					}//extractData method
		       }//anonymous inner class
				,
				bo.getEmpno(),bo.getEname(),bo.getDeptNo());
		
		return listRBO;
	}//query method
}//dao class
