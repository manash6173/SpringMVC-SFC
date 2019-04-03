package com.manash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.manash.command.EmployeeCommand;

public class CURDOperationController extends MultiActionController {
	
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.insert()");
		return new ModelAndView("register","operation","insert");
	}
	public ModelAndView modify(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.update()");
		return new ModelAndView("register","operation","update");
	}
	public ModelAndView remove(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.delete()");
		return new ModelAndView("register","operation","delete");
	}
	public ModelAndView show(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.view()");
		return new ModelAndView("register","operation","view");
	}
	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.invalid()");
		return new ModelAndView("register","operation","invalid");
	}
}
