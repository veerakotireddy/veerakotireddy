package com.citibank.enroll.customers.validator;

import com.citibank.enroll.customers.exception.EnrollmentReqInvalidException;
import com.citibank.enroll.customers.model.ClientContext;
import com.citibank.enroll.customers.model.EnrollmentResourceReq;

public class EnrollmentReqValidator {

	public void validateRequest(EnrollmentResourceReq request) throws EnrollmentReqInvalidException {
		// TODO: validate the request, if the request is valid nothing is return
		//if the request is invalid then handle the user defined exception and throws the exception
		if( request==null || request.getClientContext() == null || request.getCustomerInfo()== null) {
			 throw new EnrollmentReqInvalidException("enr001","request object is null or empty");
		}
		ClientContext clientContext=request.getClientContext();
		if(clientContext.getClientId()==null || " ".equals(clientContext.getClientId())) {
			throw new EnrollmentReqInvalidException("enr001", "client id is invalid");
		}
		// TODO : need to write the all the validations for all the required elements
		
	}

}
