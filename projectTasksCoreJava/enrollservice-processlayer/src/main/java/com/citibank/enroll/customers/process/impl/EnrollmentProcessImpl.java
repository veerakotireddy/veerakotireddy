package com.citibank.enroll.customers.process.impl;

import java.io.IOException;

import com.citibank.cardverify.service.client.CardverifyServicClient;
import com.citibank.cardverify.service.client.impl.CardverifyServicClientImpl;
import com.citibank.cardverify.service.client.model.CardverifyServicClientReq;
import com.citibank.cardverify.service.client.model.CardverifyServicClientRes;
import com.citibank.enroll.customers.dao.EnrollmentDAO;
import com.citibank.enroll.customers.dao.exception.BusinessException;
import com.citibank.enroll.customers.dao.exception.SystemException;
import com.citibank.enroll.customers.dao.impl.EnrollmentDAOImpl;
import com.citibank.enroll.customers.dao.model.EnrollmentDAOReq;
import com.citibank.enroll.customers.dao.model.EnrollmentDAORes;
import com.citibank.enroll.customers.process.EnrollmentProcess;
import com.citibank.enroll.customers.process.model.EnrollmentProcessReq;
import com.citibank.enroll.customers.process.model.EnrollmentProcessRes;

public class EnrollmentProcessImpl implements EnrollmentProcess{

	public EnrollmentProcessRes enroll(EnrollmentProcessReq processReq) throws BusinessException, SystemException {
		System.out.println("enter into process layer "+processReq);
		// TODO Auto-generated method stub
		//1. get the req from process layer
		//2.prepare the request for cardverify service client
		CardverifyServicClientReq clientReq=new CardverifyServicClientReq();


		clientReq.setChannelId(processReq.getChannelId());
		clientReq.setClientId(processReq.getClientId());
		clientReq.setCardNumber(processReq.getCardNumber());
		clientReq.setCvv(processReq.getCvv());
		clientReq.setExpDate(processReq.getExpDate());
		clientReq.setNameOnCard(processReq.getNameOnCard());
		//3. call cardverify service client. if will get sucess responce the call enroll db   else send error responce to consumer
		CardverifyServicClient servicClient=new CardverifyServicClientImpl();
		CardverifyServicClientRes clientRes=servicClient.enroll(clientReq);
		EnrollmentDAORes daoRes=null;
		if("0".equals(clientRes.getRespCode())) {
			//3.a  call cardverify service client. if will get sucess responce the call enroll db   else send error responce to consumer

			//error response to consumer
			//4.prepare the req for enroll db
			EnrollmentDAOReq daoReq=new EnrollmentDAOReq();

			daoReq.setChannelId(processReq.getChannelId());
			daoReq.setClientId(processReq.getClientId());
			daoReq.setCardNumber(processReq.getCardNumber());
			daoReq.setCvv(processReq.getCvv());
			daoReq.setExpDate(processReq.getExpDate());
			daoReq.setMobileNumber(processReq.getMobileNumber());
			daoReq.setNameOnCard(processReq.getCardNumber());


			//5.call enroll db by passing enroll dao req and ger enroll dao resp
			EnrollmentDAO dao=new EnrollmentDAOImpl();
			 daoRes=dao.enroll(daoReq);
		}else {
			//handle the exception is invalid card details 
			// TOO: need to handle user define exceptions
		}
		//6.prepare the enrollment process response
		EnrollmentProcessRes processRes=new EnrollmentProcessRes();
		processRes.setRespCode(daoRes.getRespCode());
		processRes.setRespMsg(daoRes.getRespMsg());
		processRes.setDesc(daoRes.getDesc());
		processRes.setStatus(daoRes.getStatus());
		System.out.println("exit from process layer "+processRes);

		return processRes;
	}

}
