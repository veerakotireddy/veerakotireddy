package com.citi.models;

public class OrdersInfoBean {
	private String name;
	private String date;
	private String price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrdersInfoBean [name=" + name + ", date=" + date + ", price=" + price + "]";
	}


		
	
}
