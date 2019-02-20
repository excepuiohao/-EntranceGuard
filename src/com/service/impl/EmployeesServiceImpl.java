package com.service.impl;

import com.bean.EmployeesLog;
import com.dao.factory.EmployeesFactory;
import com.service.EmployeesService;

public class EmployeesServiceImpl implements EmployeesService {
	
	public EmployeesServiceImpl()  {}
	
	@Override
	public boolean InsertEmployessLog(EmployeesLog employeesLog) {
		// TODO Auto-generated method stub
		return EmployeesFactory.getEmployeeDAOInstance().InsertEmployessLog(employeesLog);
	}

}
