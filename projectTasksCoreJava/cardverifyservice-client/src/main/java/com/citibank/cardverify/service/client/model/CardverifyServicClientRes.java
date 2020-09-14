package com.citibank.cardverify.service.client.model;

public class CardverifyServicClientRes {
	private String respCode;
	private String respMsg;
	private String status;
	private boolean active;
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "CardverifyServicClientRes [respCode=" + respCode + ", respMsg=" + respMsg + ", status=" + status
				+ ", active=" + active + "]";
	}
	
	

}
