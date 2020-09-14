package com.st.jackson.model;

public class Order {
	private String oid;
	private String oname;
	private boolean desc;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public boolean isDesc() {
		return desc;
	}
	public void setDesc(boolean desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", desc=" + desc + "]";
	}
	

}
