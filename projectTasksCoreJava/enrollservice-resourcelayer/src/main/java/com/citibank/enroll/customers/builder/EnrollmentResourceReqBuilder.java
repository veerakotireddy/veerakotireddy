package com.citibank.enroll.customers.builder;

import java.util.ArrayList;
import java.util.List;

import com.citibank.enroll.customers.model.EnrollmentResourceReq;
import com.citibank.enroll.customers.process.model.EnrollmentProcessReq;

public class EnrollmentResourceReqBuilder {

	public EnrollmentProcessReq buildProcessEnrollReq(EnrollmentResourceReq request) {
		EnrollmentProcessReq processReq=new EnrollmentProcessReq();
		processReq.setCardNumber(request.getCustomerInfo().getCardNumber());
		processReq.setChannelId(request.getClientContext().getChannelId());
		processReq.setClientId(request.getClientContext().getClientId());
		processReq.setCvv(request.getCustomerInfo().getCvv());
		processReq.setExpDate(request.getCustomerInfo().getExpDate());
		List<String> mobnums=new ArrayList<String>();
		for(String mobnum:request.getCustomerInfo().getMobileNumber()) {
			mobnums.add(mobnum);
			processReq.setMobileNumber(mobnums);
		}
		return processReq;
	}

}
