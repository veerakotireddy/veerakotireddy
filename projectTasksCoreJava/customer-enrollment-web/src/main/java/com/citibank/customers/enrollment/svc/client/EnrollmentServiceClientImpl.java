package com.citibank.customers.enrollment.svc.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.omg.CORBA.ServiceDetail;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.citibank.customers.enrollment.model.ClientContext;
import com.citibank.customers.enrollment.model.CustomerInfo;
import com.citibank.customers.enrollment.model.EnrollmentServiceReq;
import com.citibank.customers.enrollment.model.EnrollmentServiceRes;
import com.citibank.customers.enrollment.model.ServiceDetails;

public class EnrollmentServiceClientImpl implements EnrollmentServiceClient {

	/**
	 *
	 */
	public EnrollmentServiceRes enroll(EnrollmentServiceReq enrollrequest) throws IOException {
		// TODO Auto-generated method stub

		// prepare the client details
		ClientContext clientContext=new ClientContext();
		clientContext.setClientId("citi");
		clientContext.setChannelId("mobile");
		clientContext.setRequestId(UUID.randomUUID().toString());
		enrollrequest.setClientContext(clientContext);

		//prepare the customer details
		ServiceDetails serviceDetails=new ServiceDetails();
		serviceDetails.setServiceName("EnrollmentService");
		serviceDetails.setApiName("enrollment");
		serviceDetails.setVersion("1.0");
		
		enrollrequest.setServiceDetails(serviceDetails);

		//String url="http://localhost:8080/enrollment-service-war-0.0.1-SNAPSHOT/rest/v1/enrollment";
		
		//String filename="properties\\enroll-service-dev.properties";
		String env=System.getProperty("env");
		System.out.println("environment is   :"+env);
		String filename="properties\\enroll-service-"+env+".properties";
		InputStream input=getClass().getClassLoader().getResourceAsStream(filename);
		Properties properties=new Properties();
		properties.load(input);
		String url=properties.getProperty("enroll-service");
		System.out.println("service url is  :"+url);
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("Content-Type", "application/json");
		HttpEntity<EnrollmentServiceReq> request=new HttpEntity<>(enrollrequest,headers);
		
		RestTemplate restTemplate=new RestTemplate();
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory=new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setReadTimeout(500);
		restTemplate.setRequestFactory(clientHttpRequestFactory);
		
		// add these converters to do 	java object to json 
		List<HttpMessageConverter<?>> messageConverters=new ArrayList();
		messageConverters.add(new MappingJackson2HttpMessageConverter());
		
		restTemplate.setMessageConverters(messageConverters);
		EnrollmentServiceRes resourceRes=restTemplate.postForObject(url, request, EnrollmentServiceRes.class);
		return resourceRes;
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("env", "test");
		
		EnrollmentServiceReq request=new EnrollmentServiceReq();


		//prepare the customer derails info
		CustomerInfo customerInfo=new CustomerInfo();
		customerInfo.setCardNumber("23232425633636656");
		customerInfo.setCvv("123");
		customerInfo.setNameOnCard("veerakotireddy");
		customerInfo.setExpDate("12-2021");
		List<String> mobileNumber=new ArrayList<String>();
		mobileNumber.add("9160606950");
		mobileNumber.add("9154539575");
		customerInfo.setMobileNumber(mobileNumber);
		request.setCustomerInfo(customerInfo);

		EnrollmentServiceClient serviceClient=new EnrollmentServiceClientImpl();
		EnrollmentServiceRes resp=serviceClient.enroll(request);

		System.out.println("service response is ******  "+resp);

	}

}
