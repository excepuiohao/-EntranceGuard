package com.service.factory;

import com.service.VisitorService;
import com.service.impl.VisitorServiceImpl;

public class VisitorServiceFactory {
	public static VisitorService getVisitorDAOInstance() {
		return new VisitorServiceImpl() ;
	}
}
