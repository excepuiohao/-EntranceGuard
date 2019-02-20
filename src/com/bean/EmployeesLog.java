package com.bean;

import java.util.Date;

public class EmployeesLog {
	private String elid;
	private String eid;
	private String ename;
	private Date edate;

	public String getElid() {
		return elid;
	}

	public void setElid(String elid) {
		this.elid = elid;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public EmployeesLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeesLog(String elid, String eid, String ename, Date edate) {
		super();
		this.elid = elid;
		this.eid = eid;
		this.ename = ename;
		this.edate = edate;
	}

}
