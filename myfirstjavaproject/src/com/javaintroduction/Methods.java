package com.javaintroduction;

public class Methods {
	
	//Static Method
	public static void hello() {
		System.out.println("Mornin");
	}

	public static void main(String[] args) {
		System.out.println("Main method Initialized");
		hello();//calling the method
		Methods I=new Methods();//Object Creation
		I.welcome();//Calling the obj by creating the obj reference variable
		
	}
	
	//Instance Method
	void welcome() {
		System.out.println("Rainy Season Arrived");
	}

}
