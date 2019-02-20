package com.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.bean.Door;
import com.bean.Employees;
import com.bean.EmployeesLog;
import com.bean.VisitorLog;
import com.dao.AdminDAO;

public class AdminDAOImpl implements AdminDAO {

	private Connection conn = null;

	public AdminDAOImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public boolean CheckEmployeeByPwd(String eid, String epwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CheckEmployeeByFinger(String eid, String fingerprint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CheckEmployeeByCard(String eid, String card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employees> GetAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean FindEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean AdminCloseDoor() {
		// TODO Auto-generated method stub
		boolean flag=false;
		Door.getInstance().setStatus("0");
		flag=true;
		return flag;
	}

	@Override
	public boolean AdminOpenDoor() {
		// TODO Auto-generated method stub
		boolean flag=false;
		Door.getInstance().setStatus("1");
		flag=true;
		return flag;
	}

	@Override
	public List<EmployeesLog> GetAllEmployeesLog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VisitorLog> GetAllVisitorLog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean InsertEmployees(Employees employees) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UpdateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		return false;
	}

}
