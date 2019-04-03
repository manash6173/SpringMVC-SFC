package com.manash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.manash.command.EmployeeCommand;

public class CURDOperationController extends MultiActionController {
	
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.insert()");
		return new ModelAndView("register","operation","insert");
	}
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.update()");
		return new ModelAndView("register","operation","update");
	}
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.delete()");
		return new ModelAndView("register","operation","delete");
	}
	public ModelAndView view(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.view()");
		return new ModelAndView("register","operation","view");
	}
	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		System.out.println("CURDOperationController.invalid()");
		return new ModelAndView("register","operation","invalid");
	}
}
