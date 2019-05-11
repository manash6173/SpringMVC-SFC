package com.manash.service;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.manash.bo.ProductBO;
import com.manash.dto.ProductDTO;
import com.mansh.dao.ProductListDAO;

public class ProductListServiceImpl implements ProductListService {
     
	private ProductListDAO dao;
	
	public ProductListServiceImpl(ProductListDAO dao) {
		this.dao = dao;
	}


	@Override
	public List<ProductDTO> fetchAllProduct() {
		List<ProductBO> listBo=null;
		List<ProductDTO> listDto=new ArrayList<ProductDTO>();
		//use dao
		listBo=dao.getAllProduct();
		//copy data from listBo to listDTO
		listBo.forEach(bo->{
			//create productDTO class object
			ProductDTO dto=new ProductDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSlno(listDto.size()+1);
			listDto.add(dto);
		});
		return listDto;
	}

}
