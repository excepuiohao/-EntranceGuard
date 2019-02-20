package com.service.factory;

import com.service.EmployeesService;
import com.service.impl.EmployeesServiceImpl;

public class EmployeesServiceFactory {
	public static EmployeesService getEmployeeServiceInstance() {
		return new EmployeesServiceImpl() ;
	}
	
}
