package com.citi.tasks;

import java.util.concurrent.Callable;

import com.citi.models.OrdersInfoBean;
import com.citi.models.TaskResult;
import com.citi.serviceclient.OrderInfoServiceClient;

public class OrdersInfoTasks implements Callable<TaskResult> {
	private String oid;
	public OrdersInfoTasks(String oid) {
		this.oid=oid;
	}

	public TaskResult call() throws Exception {
		System.out.println("start OrdersInfoTasks ****");


		OrderInfoServiceClient orderInfoServiceClient=new OrderInfoServiceClient();
		OrdersInfoBean resp=orderInfoServiceClient.getOrders(oid);
		TaskResult taskResult=new TaskResult();
		taskResult.setResult(resp);
		taskResult.setTaskName("OrdersInfoTasks");
		System.out.println("end OrdersInfoTasks ****");

		return taskResult;
	}

}
