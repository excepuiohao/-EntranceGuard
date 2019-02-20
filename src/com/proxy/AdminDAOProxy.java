package com.proxy;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employees;
import com.bean.EmployeesLog;
import com.bean.VisitorLog;
import com.dao.AdminDAO;
import com.dao.impl.AdminDAOImpl;
import com.dbc.DataBaseConnection;


public class AdminDAOProxy implements AdminDAO {
	private DataBaseConnection dbc = null;
	private AdminDAO dao = null;

	public AdminDAOProxy() {
		try {
			this.dbc = new DataBaseConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dao = new AdminDAOImpl(this.dbc.getConnection());
	}

	@Override
	public boolean CheckEmployeeByPwd(String eid, String epwd) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.CheckEmployeeByPwd(eid, epwd);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public boolean CheckEmployeeByFinger(String eid, String fingerprint) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.CheckEmployeeByFinger(eid, fingerprint);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public boolean CheckEmployeeByCard(String eid, String card) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.CheckEmployeeByCard(eid, card);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public List<Employees> GetAllEmployees() {
		// TODO Auto-generated method stub
		List<Employees> list=new ArrayList<Employees>();
		try {
			list = this.dao.GetAllEmployees();
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return list;
	}

	@Override
	public boolean FindEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.FindEmployeeByName(ename);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public boolean AdminCloseDoor() {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.AdminCloseDoor();
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public boolean AdminOpenDoor() {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.AdminOpenDoor();
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public List<EmployeesLog> GetAllEmployeesLog() {
		// TODO Auto-generated method stub
		List<EmployeesLog> list=new ArrayList<EmployeesLog>();
		try {
			list = this.dao.GetAllEmployeesLog();
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return list;
	}

	@Override
	public List<VisitorLog> GetAllVisitorLog() {
		// TODO Auto-generated method stub
		List<VisitorLog> list=new ArrayList<VisitorLog>();
		try {
			list = this.dao.GetAllVisitorLog();
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return list;
	}

	@Override
	public boolean InsertEmployees(Employees employees) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.InsertEmployees(employees);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}

	@Override
	public boolean UpdateEmployee(Employees employees) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			flag=this.dao.UpdateEmployee(employees);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			this.dbc.closedriver();
		}
		return flag;
	}
}
