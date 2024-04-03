package com.madotrasaab.nov26;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorialNumber = 1;
		//5! =  5 * 4 * 3* 2 * 1
		//10!= 10 * 9*8....*1
		for(int index = 7; index >=1; index--) {
			factorialNumber = factorialNumber * index;
		}
		
		//for loop
		//1. initialization
		//2. Condition to be met
		//3. Increment or decrement operation
		System.out.println(factorialNumber);
		
		factorialNumber = 1;
		for(int index = 7; index >=1; ) {
			factorialNumber = factorialNumber * index;
			index--;
		}
		System.out.println(factorialNumber);
		
		boolean age = true;
		for(int count=0, myIndex =10; age;factorialNumber++, myIndex--, age=true) {
			count++;
			System.out.println("My name is Java");
			if(count == 7) {
				age = false;
			}
		}
	}

}
