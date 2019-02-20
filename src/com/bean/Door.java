package com.bean;

public class Door {
	private String status;//0��ʾ��  1��ʾ��

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
