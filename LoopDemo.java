package com.madotrasaab.nov26;

import java.io.IOException;

public class LoopDemo {
	
	//return data type is int
	public static int getAge() {
		return 10;
	}

	//return data type is float
//		public static float getSalary() {
//			return 10000.50f;
//		}
//		
		
		public static int addNumbers(int number1, int number2) throws RuntimeException{
			
			if(number1 <= 0) {
				throw new RuntimeException("First parameter cannot be negative");
			}
			return number1 + number2;
			
			//if i have to return an error how do i do?
			
			//return -1 as errors
		}
		
		public static float getBalance() {
			//assume this 45 lakhs is coming from database;
			String balStr = "100";
			if(balStr.equals("")) {
				throw new RuntimeException("Balance cannot be empty");
			}
			float balValue = Float.parseFloat(balStr);
			
			
			return balValue;
		}
		
		public static float getOutstandingBalance() throws IOException{
			//assume this 45 lakhs is coming from database;
			String balStr = "";
			if(balStr.equals("")) {
				throw new IOException("Balance cannot be empty");
			}
			float balValue = Float.parseFloat(balStr);
			
			
			return balValue;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorialNumber = 5;
		int factorialValue = 1;
		do {
			factorialValue = factorialValue * (factorialNumber);
			factorialNumber--;
		}while(factorialNumber>=1);
		
		System.out.println(factorialValue);
		
		factorialNumber = 5;
		factorialValue = 1;
		while(factorialNumber>=1) {
			factorialValue = factorialValue * (factorialNumber);
			factorialNumber--;			
		}
		System.out.println(factorialValue);
		
		int x =30;
		int y = 20;
		
		y = (x==10)? 25:50;
		
		if(x == 10) {
			y = 25;
		} else {
			y = 50;
		}
		System.out.println(y);
		
		int returnValue = addNumbers(50,20);
		System.out.println(returnValue);
		
		float balanceToBeDisplayed;
		try {
			balanceToBeDisplayed = getBalance();
		}catch(RuntimeException re) {
			balanceToBeDisplayed = 0;
		}
		System.out.println(balanceToBeDisplayed);
		
		try {
			getOutstandingBalance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
