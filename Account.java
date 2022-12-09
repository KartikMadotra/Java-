package com.infograss.nov20;

public class Account {
	
	private String accountType;
	protected float currentBalance;
	private float availableBalance;
	private String branchCode;
	
	//setters and getters
	//set is to set the value
	//get is to get the value
	//encapsulation
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public float getCurrentBalance() {
		return currentBalance;
	}
	
	//definition of setCurrentBalance in the base class
	public void setCurrentBalance(float currentBalance) {
		
		if(currentBalance >999999999) {
			throw new RuntimeException("big number");
		}
		this.currentBalance = currentBalance;
	}
	public float getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(float availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
	public void finalize() {
		//do the clean up tasks here.
		System.out.println("Account object is getting terminated");
	}
	

}
