package com.citi.tasks;

import java.util.concurrent.Callable;

import com.citi.dao.OrdersDAO;
import com.citi.models.OrderDAOBean;
import com.citi.models.OrdersInfoBean;
import com.citi.models.TaskResult;
import com.citi.serviceclient.OrderInfoServiceClient;

public class OrdersDaoTask implements Callable<TaskResult> {
	private String oid;
	public OrdersDaoTask(String oid) {
		this.oid=oid;
	}

	public TaskResult call() throws Exception {
		System.out.println("start OrdersDaoTask ****");

		OrdersDAO ordersDAO=new OrdersDAO();
		 OrderDAOBean resp=ordersDAO.getOrders(oid);
		TaskResult taskResult=new TaskResult();
		taskResult.setResult(resp);
		taskResult.setTaskName("OrdersDaoTask");
	
		System.out.println("end OrdersDaoTask ****");
		return taskResult;
	}
}
