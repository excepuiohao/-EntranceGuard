package com.bean;

public class Door {
	private String status;//0表示关  1表示开

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private Door() {
		// TODO Auto-generated constructor stub
	}

	private static Door door = null;

	public static Door getInstance() {
		if (door == null) {
			door = new Door();
		}
		return door;
	}

}
