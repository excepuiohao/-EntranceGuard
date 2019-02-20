package com.service.impl;

import java.util.List;

import com.bean.Employees;
import com.bean.EmployeesLog;
import com.bean.VisitorLog;
import com.dao.factory.AdminFactory;
import com.service.AdminService;

public class AdminServiceImpl  implements AdminService{

	public AdminServiceImpl(){
	}
	
	@Override
	public boolean CheckEmployeeByPwd(String eid, String epwd) {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().CheckEmployeeByPwd(eid, epwd);

	}

	@Override
	public boolean CheckEmployeeByFinger(String eid, String fingerprint) {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().CheckEmployeeByFinger(eid, fingerprint);
	}

	@Override
	public boolean CheckEmployeeByCard(String eid, String card) {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().CheckEmployeeByCard(eid, card);
	}

	@Override
	public List<Employees> GetAllEmployees() {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().GetAllEmployees();
	}

	@Override
	public boolean FindEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().FindEmployeeByName(ename);
	}

	@Override
	public boolean AdminCloseDoor() {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().AdminCloseDoor();
	}

	@Override
	public boolean AdminOpenDoor() {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().AdminOpenDoor();
	}

	@Override
	public List<EmployeesLog> GetAllEmployeesLog() {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().GetAllEmployeesLog();
	}

	@Override
	public List<VisitorLog> GetAllVisitorLog() {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().GetAllVisitorLog();
	}

	@Override
	public boolean InsertEmployees(Employees employees) {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().InsertEmployees(employees);
	}

	@Override
	public boolean UpdateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return AdminFactory.getAdminDAOInstance().UpdateEmployee(employees);
	}

}
