package com.bus.service;

import java.util.List;

import com.bus.entity.Employees;
import com.github.pagehelper.Page;

public interface EmployeesService {
	
	
		public int addEmployees(Employees e);
		
	
		public int removeEmployeesById(int id);
		
		
		public int modifyEmployees(Employees e);
		
	
		public List<Employees> findAllEmployees();
		
		
		public Page<Employees> findEmployeesByPage(int currentPage,int pageSize);
		
		
}
