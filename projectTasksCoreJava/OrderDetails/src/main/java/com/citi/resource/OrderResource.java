package com.citi.resource;

import java.util.concurrent.ExecutionException;

import com.citi.models.OrderDetailsResp;
import com.citi.processor.OrderProcessor;

public class OrderResource {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		OrderProcessor processor=new OrderProcessor();
		  OrderDetailsResp response = processor.getOrders("123654");
		  System.out.println("response is "+response);
		
	}

}
