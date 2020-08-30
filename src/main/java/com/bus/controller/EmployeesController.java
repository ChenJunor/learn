package com.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bus.entity.Employees;
import com.bus.service.EmployeesService;
import com.github.pagehelper.Page;

@Controller
public class EmployeesController {

	@Autowired
	EmployeesService es;
	

	@RequestMapping("/showAll")
	public ModelAndView showAll(int currentPage,int pageSize){
		System.out.println("pageSize:"+pageSize+"    currentPage:"+currentPage);
		Page<Employees> page = es.findEmployeesByPage(currentPage, pageSize);
		ModelAndView mav = new ModelAndView();
		mav.addObject("page", page);
		mav.setViewName("employee/employees/showEmployees.jsp");
		
		return mav;
	}
	
}
