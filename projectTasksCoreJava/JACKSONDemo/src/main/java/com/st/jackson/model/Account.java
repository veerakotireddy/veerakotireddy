package com.st.jackson.model;

public class Account {

	private String bankname;
	private String accountnumber;
	private String branchname;
	private double balance;
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [bankname=" + bankname + ", accountnumber=" + accountnumber + ", branchname=" + branchname
				+ ", balance=" + balance + "]";
	}
	
	
}
