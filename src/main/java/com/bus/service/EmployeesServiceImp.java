package com.bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bus.entity.Employees;
import com.bus.entity.EmployeesExample;
import com.bus.mapper.EmployeesMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeesServiceImp implements EmployeesService{
	
	@Autowired	
	EmployeesMapper em;

	@Override
	public int addEmployees(Employees e) {

		return em.insertSelective(e);
	}

	@Override
	public int removeEmployeesById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyEmployees(Employees cs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employees> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Employees> findEmployeesByPage(int currentPage,int pageSize) {
		Page<Employees> page = PageHelper.startPage(1,5);
		
		EmployeesExample example = new EmployeesExample();
		em.selectByExample(example);
		
		
		return page;
	}	
	
	
	
	
	
	
	
	
			
}
