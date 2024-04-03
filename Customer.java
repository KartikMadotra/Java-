package com.madotrasaab.nov20;

public class Customer {
	
	String branchCode;
	int custType;

	//composition.
	//Customer has account.
	//When customer gets terminated, account also gets terminated.
	private Account account = new Account();
	
	private Account aggregatedAccount;
	
	//zero argument constructor
	public Customer() {
		//do some initialization tasks here.
		branchCode = "NY";
	}

	//example of multiple argument constructors
	public Customer(String branchCode) {
		//do some initialization tasks here.
		this.branchCode = branchCode;
	}
	
	//example of multiple argument constructors
	public Customer(String branchCode, int customerType) {
		//do some initialization tasks here.
		this.branchCode = branchCode;
		custType  = customerType;
	}

	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public Account getAggregatedAccount() {
		return aggregatedAccount;
	}

	public void setAggregatedAccount(Account aggregatedAccount) {
		this.aggregatedAccount = aggregatedAccount;
	}

	public void finalize() {
		//do the clean up tasks here.
		System.out.println("Object is getting terminated");
	}
			
	public static void main(String[] args) {
		Customer john = new Customer();
		Account johnAccount = new Account();
		john.setAggregatedAccount(johnAccount);
		Customer venkat = new Customer("LA");
		Customer saravana = new Customer("LA", 2);
		System.out.println(john.getBranchCode());
		System.out.println(venkat.getBranchCode());
		john = null;
		System.gc();
		
		try {
			Thread.sleep(100000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
