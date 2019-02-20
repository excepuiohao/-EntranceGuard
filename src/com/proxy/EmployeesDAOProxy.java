package com.proxy;

import com.bean.EmployeesLog;
import com.dao.EmployeesDAO;
import com.dao.impl.EmployeesDAOImpl;
import com.dbc.DataBaseConnection;

public class EmployeesDAOProxy implements EmployeesDAO{
	private DataBaseConnection dbc = null;
	private EmployeesDAO dao = null;

	public EmployeesDAOProxy() {
		try {
			this.dbc = new DataBaseConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dao = new EmployeesDAOImpl(this.dbc.getConnection());
	}
	
	@Override
	public boolean InsertEmployessLog(EmployeesLog employeesLog) {
		boolean flag = true;
		try {
			flag = this.dao.InsertEmployessLog(employeesLog);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;

	}

}
