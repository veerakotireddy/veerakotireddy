package com.citibank.cardverify.service.client.impl;

import com.citibank.cardverify.service.client.CardverifyServicClient;
import com.citibank.cardverify.service.client.model.CardverifyServicClientReq;
import com.citibank.cardverify.service.client.model.CardverifyServicClientRes;

public class CardverifyServicClientImpl implements CardverifyServicClient{

	public CardverifyServicClientRes enroll(CardverifyServicClientReq clientReq) {
		System.out.println("enter into cardverifyservice client "+clientReq);
		// TODO Auto-generated method stub
		//1.get the request from process layer
		//2.prepare the req for card verify service
		//3.write service client code to call the service and get service response
		//4. prepare the service client response using service response
		CardverifyServicClientRes clientRes=new CardverifyServicClientRes();
		clientRes.setActive(true);
		clientRes.setRespCode("0");
		clientRes.setRespMsg("valid");
		clientRes.setStatus("valid");
		System.out.println("exit from cardverifyservice client "+clientRes);
		return clientRes;
	}

}
