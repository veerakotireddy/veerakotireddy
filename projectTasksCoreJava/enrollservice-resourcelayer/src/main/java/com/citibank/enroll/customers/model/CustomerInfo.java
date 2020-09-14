package com.citibank.enroll.customers.model;

import java.util.List;

public class CustomerInfo {
	private  List<String> mobileNumber;
	private String cardNumber;
	private String cvv;
	private String expDate;
	private String nameOnCard;
	public List<String> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<String> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	@Override
	public String toString() {
		return "CustomerInfo [mobileNumber=" + mobileNumber + ", cardNumber=" + cardNumber + ", cvv=" + cvv
				+ ", expDate=" + expDate + ", nameOnCard=" + nameOnCard + "]";
	}
	
}
