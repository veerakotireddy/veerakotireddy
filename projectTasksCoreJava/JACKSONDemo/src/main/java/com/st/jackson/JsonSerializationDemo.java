package com.st.jackson;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.st.jackson.model.Account;
import com.st.jackson.model.ClientContext;
import com.st.jackson.model.Customer;
import com.st.jackson.model.CustomerInfo;
import com.st.jackson.model.EnrollmentResourceReq;
import com.st.jackson.model.EnrollmentResourceRes;
import com.st.jackson.model.Order;
import com.st.jackson.model.ServiceDetails;
import com.st.jackson.model.StatusBlock;

public class JsonSerializationDemo {

	public static void main(String[] args) throws JsonProcessingException {
		
		Customer customer=new Customer();
		customer.setFname("veera");
		customer.setLname("vadicharla");
		customer.setMobile("9160606950");
		customer.setAddress("machavaram");
		customer.setDob("22-09-1994");
		customer.setEmail("vvkoti221994@gmail.com");
		customer.setGender("male");
		customer.setTitle("customer details");
		
		// TODO Auto-generated method stub
		Order order=new Order();
		order.setOid("1234");
		order.setOname("mobiles");
		order.setDesc(true);
		Order order1=new Order();
		order1.setOid("666");
		order1.setOname("vh");
		order1.setDesc(false);
		/*
		 * List orderlist=new ArrayList<Order>(); orderlist.add(order);
		 * orderlist.add(order1); customer.setOrderlist(orderlist); Account account=new
		 * Account(); account.setAccountnumber("5456555656565");
		 * account.setBankname("sbi"); account.setBranchname("nrt");
		 * account.setBalance(12656.22); customer.setAccount(account);
		 */
		
		EnrollmentResourceReq enrollmentResourceReq=new EnrollmentResourceReq();
		ClientContext clientContext=new ClientContext();
		clientContext.setClientId("citi");
		clientContext.setChannelId("mobile");
		clientContext.setRequestId(UUID.randomUUID().toString());
		clientContext.setMessageTimeStamp("somthing");
		
		CustomerInfo customerInfo=new CustomerInfo();
		List<String> mobileNumber=new ArrayList<String>();
		mobileNumber.add("9160606950");
		mobileNumber.add("9154539575");
		
		customerInfo.setMobileNumber(mobileNumber);
		customerInfo.setCardNumber("20261363818889");
		customerInfo.setCvv("889");
		customerInfo.setExpDate("20-12-2020");
		customerInfo.setNameOnCard("vadicharla veerakotireddy");
		ServiceDetails serviceDetails =new ServiceDetails();
		serviceDetails.setServiceName("enrollmentService");
		serviceDetails.setApiName("enrollment");
		serviceDetails.setVersion("1.0");
		enrollmentResourceReq.setClientContext(clientContext);
		enrollmentResourceReq.setCustomerInfo(customerInfo);
		enrollmentResourceReq.setServiceDetails(serviceDetails);
		EnrollmentResourceRes resourceRes=new EnrollmentResourceRes();
		resourceRes.setAckno("jknjk236sd655");
		StatusBlock status=new StatusBlock();
		
		status.setRespCode("0");
		status.setRespMsg("success");
		status.setStatus("enrollment success");
		resourceRes.setStatus(status);
		
		resourceRes.setResourceReq(enrollmentResourceReq);
		
		
		ObjectMapper mapper=new ObjectMapper();
	//String jsonndata=	mapper.writeValueAsString(order);
		//String jsonndata=	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(enrollmentResourceReq);
		String jsonndata=	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resourceRes);


	
	System.out.println(" json data is   :"+jsonndata);

	}

}
