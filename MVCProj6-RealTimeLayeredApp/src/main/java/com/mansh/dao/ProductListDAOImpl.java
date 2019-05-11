package com.mansh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manash.bo.ProductBO;

public class ProductListDAOImpl implements ProductListDAO {
	private static final String GET_ALL_PRODUCTS="SELECT PID,PNAME,PRICE,MFGDATE,EXPDATE FROM PRODUCT_LIST";
	private JdbcTemplate jt;

	public ProductListDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<ProductBO> getAllProduct() {
		List<ProductBO> listBO=null;
		listBO=jt.query(GET_ALL_PRODUCTS, new ProductExtractor());
		return listBO;
	}
	
	private class ProductExtractor implements ResultSetExtractor<List<ProductBO>>{

		@Override
		public List<ProductBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<ProductBO> listBo=null;
			listBo=new ArrayList<ProductBO>();
			//copy object from resultSet object to bo object
			while(rs.next()) {
				ProductBO bo=new ProductBO();
				bo.setPid(rs.getInt(1));
				bo.setPname(rs.getString(2));
				bo.setPrice(rs.getFloat(3));
				bo.setMfgDate(rs.getDate(4));
				bo.setExpDate(rs.getDate(5));
				//add object to listBo 
				listBo.add(bo);
			}
			return listBo;
		} //extractData method
	}//inner class
}//outer class
