package com.st.b.model;

public class Breq {
	private String oid;
	private String oname;
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
	@Override
	public String toString() {
		return "Breq [oid=" + oid + ", oname=" + oname + "]";
	}
	

}
