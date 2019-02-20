package com.dao.impl;

import java.sql.Connection;

import com.bean.EmployeesLog;
import com.dao.EmployeesDAO;

public class EmployeesDAOImpl implements EmployeesDAO {

	private Connection conn = null;

	public EmployeesDAOImpl(Connection conn) {
		this.conn = conn;
	}
	@Override
	public boolean InsertEmployessLog(EmployeesLog employeesLog) {
		// TODO Auto-generated method stub
		return false;
	}

}
