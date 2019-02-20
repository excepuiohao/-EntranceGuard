package com.bean;

public class Admin {
	private String aid;
	private String aname;
	private String apw;

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApw() {
		return apw;
	}

	public void setApw(String apw) {
		this.apw = apw;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String aid, String aname, String apw) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.apw = apw;
	}

}
