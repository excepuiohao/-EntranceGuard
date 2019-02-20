package com.bean;

public class Employees {
	private String eid;
	private String ename;
	private String epwd;
	private String fingerprint;
	private String card;

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

	public String getEpwd() {
		return epwd;
	}

	public void setEpwd(String epwd) {
		this.epwd = epwd;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String eid, String ename, String epwd, String fingerprint, String card) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epwd = epwd;
		this.fingerprint = fingerprint;
		this.card = card;
	}

}
