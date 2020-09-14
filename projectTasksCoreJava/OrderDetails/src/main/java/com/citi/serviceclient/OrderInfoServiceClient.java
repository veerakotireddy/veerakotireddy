package com.citi.serviceclient;

import com.citi.models.OrdersInfoBean;

public class OrderInfoServiceClient {
public  OrdersInfoBean getOrders(String oid)
{
	// call the  service and get the respponse
	//prepare the ordersInfoBean response
	OrdersInfoBean  ordersInfoBean=new OrdersInfoBean();
	ordersInfoBean.setName("mobiles");
	ordersInfoBean.setPrice("300000");
	ordersInfoBean.setDate("10-09-2020");
	return ordersInfoBean;
	
}
}
