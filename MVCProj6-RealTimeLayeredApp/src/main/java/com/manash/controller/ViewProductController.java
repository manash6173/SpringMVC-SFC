package com.manash.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.manash.dto.ProductDTO;
import com.manash.service.ProductListService;

public class ViewProductController extends AbstractController {
	private ProductListService service;

	public ViewProductController(ProductListService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
        List<ProductDTO> listdto=null;
		ModelAndView mav=null;
        //invoke service class method
        listdto=service.fetchAllProduct();
        //create MAV object
        mav=new ModelAndView();
        //add model data and logical view name to mav object
        mav.addObject("prodList",listdto);
        mav.setViewName("product_list");
		return mav;
	}

}
