package com.bean;

import java.util.Date;

public class VisitorLog {
	private String vlid;
	private String vname;
	private String ename;
	private Date vdate;

	public String getVlid() {
		return vlid;
	}

	public void setVlid(String vlid) {
		this.vlid = vlid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getVdate() {
		return vdate;
	}

	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}

	public VisitorLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitorLog(String vlid, String vname, String ename, Date vdate) {
		super();
		this.vlid = vlid;
		this.vname = vname;
		this.ename = ename;
		this.vdate = vdate;
	}

}
