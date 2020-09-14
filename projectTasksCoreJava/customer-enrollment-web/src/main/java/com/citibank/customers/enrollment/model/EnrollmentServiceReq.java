package com.citibank.customers.enrollment.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnrollmentServiceReq {
	private ClientContext clientContext;
	private CustomerInfo customerInfo;
	private ServiceDetails serviceDetails;
	public ClientContext getClientContext() {
		return clientContext;
	}
	public void setClientContext(ClientContext clientContext) {
		this.clientContext = clientContext;
	}
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public ServiceDetails getServiceDetails() {
		return serviceDetails;
	}
	public void setServiceDetails(ServiceDetails serviceDetails) {
		this.serviceDetails = serviceDetails;
	}
	@Override
	public String toString() {
		return "EnrollmentResourceReq [clientContext=" + clientContext + ", customerInfo=" + customerInfo
				+ ", serviceDetails=" + serviceDetails + "]";
	}
	

}
