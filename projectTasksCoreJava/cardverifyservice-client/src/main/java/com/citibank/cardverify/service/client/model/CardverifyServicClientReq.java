package com.citibank.cardverify.service.client.model;

import java.util.List;

public class CardverifyServicClientReq {
	private String clientId;
	private String channelId;
	private String cardNumber;
	private String cvv;
	private String expDate;
	private String nameOnCard;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
		return "CardverifyServicClientReq [clientId=" + clientId + ", channelId=" + channelId + ", cardNumber="
				+ cardNumber + ", cvv=" + cvv + ", expDate=" + expDate + ", nameOnCard=" + nameOnCard + "]";
	}
	
}
