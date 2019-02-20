package com.service.impl;

import com.bean.VisitorLog;
import com.service.VisitorService;
import com.service.factory.VisitorServiceFactory;

public class VisitorServiceImpl implements VisitorService {
	public VisitorServiceImpl()  {}
	@Override
	public boolean InsertVisitorLog(VisitorLog visitorlog) {
		// TODO Auto-generated method stub
		return VisitorServiceFactory.getVisitorDAOInstance().InsertVisitorLog(visitorlog);
	}

}
