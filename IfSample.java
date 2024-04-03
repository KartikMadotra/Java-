package com.madotrasaab.nov26;

public class IfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 1;
		boolean ageFlag = (age > 5);
		System.out.println(ageFlag);
		
		String city = "LOSANGELES";
		boolean cityFlag = city.equals("CHENNAI");
		System.out.println(cityFlag);
		
		boolean combinedFlag = ageFlag && cityFlag;
		System.out.println(combinedFlag);
		
		boolean orFlag = ageFlag || cityFlag;
		System.out.println(orFlag);
		
		boolean notFlag = !ageFlag;
		System.out.println(notFlag);
		
		ageFlag = (age > 5);
		//LHS = RHS
		if(ageFlag) {
			System.out.println("Inside < than condition");
		}

		if((age > 5)) {
			System.out.println("Inside < expression than condition");
		}
		
		//if(BOOLEAN FLAG)
	
		
		if(combinedFlag) {
			System.out.println("Inside combinedFlag than condition");
		}

		if((age > 5) && (city.equals("CHENNAI"))) {
			System.out.println("Inside < expression than condition");
		}
		
		city = "LOSANGELES";
		if(city.equals("CHENNAI")) {
			
		} 	else if (city.equals("MUMBAI")) {
		}	else if (city.equals("DELHI")) {
		} else {
			
		}
		
	if(city.equals("CHENNAI")) {
		if (age <= 10) {
			
		} else {
			
		}
	}
			
		
	}

}
