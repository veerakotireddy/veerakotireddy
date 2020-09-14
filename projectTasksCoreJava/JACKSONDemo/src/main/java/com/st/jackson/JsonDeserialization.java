package com.st.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.st.jackson.model.Order;

public class JsonDeserialization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper=new ObjectMapper();
		Order order=mapper.readValue(new File("E:\\projectTasksCoreJava\\JACKSONDemo\\src\\main\\resources\\order.json"), Order.class);
	
		System.out.println("deserialization :"+order);
	
	}

}
