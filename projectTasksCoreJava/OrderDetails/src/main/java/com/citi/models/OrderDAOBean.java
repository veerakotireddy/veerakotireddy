package com.citi.models;

public class OrderDAOBean {
	private String desc;
	private String status;
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "OrderDAOBean [desc=" + desc + ", status=" + status + "]";
	}
	

}
