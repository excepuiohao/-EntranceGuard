package com.proxy;

import com.bean.VisitorLog;
import com.dao.VisitorDAO;
import com.dao.impl.VisitorDAOImpl;
import com.dbc.DataBaseConnection;

public class VisitorDAOProxy implements VisitorDAO {
	private DataBaseConnection dbc = null;
	private VisitorDAO dao = null;

	public VisitorDAOProxy() {
		try {
			this.dbc = new DataBaseConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dao = new VisitorDAOImpl(this.dbc.getConnection());
	}

	@Override
	public boolean InsertVisitorLog(VisitorLog visitorlog) {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.InsertVisitorLog(visitorlog);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.closedriver();
		}
		return flag;
	}
	
}
