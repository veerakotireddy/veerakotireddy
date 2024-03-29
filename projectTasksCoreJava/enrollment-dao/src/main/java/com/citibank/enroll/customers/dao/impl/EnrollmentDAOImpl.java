package com.citibank.enroll.customers.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.citibank.enroll.customers.dao.EnrollmentDAO;
import com.citibank.enroll.customers.dao.exception.BusinessException;
import com.citibank.enroll.customers.dao.exception.SystemException;
import com.citibank.enroll.customers.dao.model.EnrollmentDAOReq;
import com.citibank.enroll.customers.dao.model.EnrollmentDAORes;

public class EnrollmentDAOImpl implements EnrollmentDAO{

	public EnrollmentDAORes enroll(EnrollmentDAOReq daoReq) throws BusinessException, SystemException {
		System.out.println("enter into enrollment dao "+daoReq);
		// TODO Auto-generated method stub
		//1.get the dao req from process layer
		//4.prepare the dao response
		EnrollmentDAORes daoRes=null;
		try {
			
		//	 String env=System.getProperty("env");
			//System.out.println("environment is   :"+env);
			//String filename="properties\\enroll-"+env+"-db"+".properties";
			//InputStream input=getClass().getClassLoader().getResourceAsStream(filename);
			//Properties properties=new Properties();
			//properties.load(input);
			//String dbUrl=properties.getProperty("db-url");
			//System.out.println(" db url  :"+dbUrl);
			//String username=properties.getProperty("username");
			//System.out.println(" username  :"+username);
			//String password=properties.getProperty("password");
			//System.out.println(" password  :"+password);
			
			
			//2. prepare the db req(sql or plsql)
			//3.call db by passing the req and get the dbresp as resultset
			String respCode="0"; // get the response from database
			String respMsg="success"; // get the response from database
			
			
			daoRes = new EnrollmentDAORes();
			if("0".equals(respCode)) {
			daoRes.setRespCode("0");
			daoRes.setRespMsg("success");
			daoRes.setDesc("good");
			daoRes.setStatus("delivered");
			daoRes.setAck("12321533223");
			}
			else if("100".equals(respCode) || "100".equals(respCode) || "101".equals(respCode) || "102".equals(respCode) || "103".equals(respCode)) {
				throw new BusinessException(respCode, respMsg);
			}
			else
			{
				throw new SystemException(respCode, respMsg);
			}
		} catch (BusinessException e) {
			// TODO loging details
			e.printStackTrace();
			throw e;
			
		}
		 catch (SystemException e) {
				// TODO loging details
				e.printStackTrace();
				throw e;
			}
		System.out.println("exit from enrollment dao "+daoRes);
		return daoRes;
	}

}
