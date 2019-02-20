package com.dao.factory;

import com.dao.EmployeesDAO;
import com.proxy.EmployeesDAOProxy;

public class EmployeesFactory {
	public static EmployeesDAO getEmployeeDAOInstance(){
		return new EmployeesDAOProxy() ;
	}
}
