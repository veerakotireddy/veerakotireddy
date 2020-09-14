package com.citibank.customers.enrollment.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnrollmentServiceRes{
	private EnrollmentServiceReq resourceReq;
	private StatusBlock status;
	private String ackno;
	public EnrollmentServiceReq getResourceReq() {
		return resourceReq;
	}
	public void setResourceReq(EnrollmentServiceReq resourceReq) {
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
