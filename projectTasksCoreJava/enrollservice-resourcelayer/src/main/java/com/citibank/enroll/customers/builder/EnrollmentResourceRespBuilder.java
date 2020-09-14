package com.citibank.enroll.customers.builder;

import com.citibank.enroll.customers.model.EnrollmentResourceReq;
import com.citibank.enroll.customers.model.EnrollmentResourceRes;
import com.citibank.enroll.customers.model.StatusBlock;
import com.citibank.enroll.customers.process.model.EnrollmentProcessRes;

public class EnrollmentResourceRespBuilder {

	public EnrollmentResourceRes buildResourceResp(EnrollmentProcessRes processRes, EnrollmentResourceReq request) {

		EnrollmentResourceRes resourceRes=new EnrollmentResourceRes();
		//resourceRes.setAckno("jknjk236sd655");
		StatusBlock  status=new StatusBlock();

		status.setRespCode(processRes.getRespCode());
		status.setRespMsg(processRes.getRespMsg());
		status.setStatus(processRes.getStatus());
		status.setStatus(processRes.getStatus());
		resourceRes.setStatus(status);

		resourceRes.setResourceReq(request);
		return resourceRes;
		// TODO Auto-generated method stub
		
	}

}
