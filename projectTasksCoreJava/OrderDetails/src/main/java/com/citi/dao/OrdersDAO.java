package com.citi.dao;

import com.citi.models.OrderDAOBean;

public class OrdersDAO {

	public OrderDAOBean getOrders(String oid) {
		//connect to db
		//get thr  response from db
		
		OrderDAOBean orderDAOBean=new OrderDAOBean();
		orderDAOBean.setDesc("good");
		orderDAOBean.setStatus("delivered");
		return orderDAOBean;
		
	}
}
