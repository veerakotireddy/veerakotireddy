package com.citibank.enroll.customers.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnrollmentResourceRes{
	private EnrollmentResourceReq resourceReq;
	private StatusBlock status;
	private String ackno;
	public EnrollmentResourceReq getResourceReq() {
		return resourceReq;
	}
	public void setResourceReq(EnrollmentResourceReq resourceReq) {
		this.resourceReq = resourceReq;
	}
	public StatusBlock getStatus() {
		return status;
	}
	public void setStatus(StatusBlock status) {
		this.status = status;
	}
	public String getAckno() {
		return ackno;
	}
	public void setAckno(String ackno) {
		this.ackno = ackno;
	}
	@Override
	public String toString() {
		return "EnrollmentResourceRes [resourceReq=" + resourceReq + ", status=" + status + ", ackno=" + ackno + "]";
	}
	
	

}
