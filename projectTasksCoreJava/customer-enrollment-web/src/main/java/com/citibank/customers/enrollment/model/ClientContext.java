package com.citibank.customers.enrollment.model;

public class ClientContext {
private String clientId;
private String channelId;
private String requestId;
private String messageTimeStamp;
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
public String getRequestId() {
	return requestId;
}
public void setRequestId(String requestId) {
	this.requestId = requestId;
}
public String getMessageTimeStamp() {
	return messageTimeStamp;
}
public void setMessageTimeStamp(String messageTimeStamp) {
	this.messageTimeStamp = messageTimeStamp;
}
@Override
public String toString() {
	return "ClientContext [clientId=" + clientId + ", channelId=" + channelId + ", requestId=" + requestId
			+ ", messageTimeStamp=" + messageTimeStamp + "]";
}

}
