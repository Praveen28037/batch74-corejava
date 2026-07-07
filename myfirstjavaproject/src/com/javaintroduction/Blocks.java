package com.javaintroduction;

public class Blocks{
	
	
	//Static block
	
	static {
			System.out.println("Greetings");
	}
		
	public static void main(String[] args) {

		System.out.println("How are you doing");
				
	}
	
	//Static block --> wheather it is after main method it will executes before main method because of Initialzation in java...
	
	static {
			System.out.println("Haven't seen you for a while");
	}

}
