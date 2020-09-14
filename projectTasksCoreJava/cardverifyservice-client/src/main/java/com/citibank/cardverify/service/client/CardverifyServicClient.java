package com.citibank.cardverify.service.client;

import com.citibank.cardverify.service.client.model.CardverifyServicClientReq;
import com.citibank.cardverify.service.client.model.CardverifyServicClientRes;

public interface CardverifyServicClient {
	 CardverifyServicClientRes enroll(CardverifyServicClientReq clientReq);

}
