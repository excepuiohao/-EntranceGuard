package com.dao.impl;

import java.sql.Connection;

import com.bean.VisitorLog;
import com.dao.VisitorDAO;

public class VisitorDAOImpl implements VisitorDAO {
	private Connection conn = null;

	public VisitorDAOImpl(Connection conn) {
		this.conn = conn;
	}
	@Override
	public boolean InsertVisitorLog(VisitorLog visitorlog) {
		// TODO Auto-generated method stub
		return false;
	}

}
