package com.citibank.enroll.customers.exception;

public class EnrollmentReqInvalidException extends Exception {
	private String respCode;
	private String respMsg;
	public EnrollmentReqInvalidException(String respCode,String respMsg) {
		this.respCode=respCode;
		this.respMsg=respMsg;
	}
	public String getRespCode() {
		return respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}
	
	
	
	

}
