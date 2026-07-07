package com.javaintroduction;

public class Football {
	
	//static 
	static String country="India";
	static String colour="Blue";
	
	//instance
	String Player="Sunil chhetri";
	int jersey =11;
	
	//static 
	static String country2="portugal";
	static String colour2="Red";
		
	//instance
	String Player2="Ronaldo";
	int jersey2 =7;
	
	//static 
	static String country3="Argentina";
	static String colour3="White";
		
		//instance
	String Player3="Messi";
	int jersey3 =10;
		
		
	public static void main(String[] args) {
		System.out.println("Welcome to  FIFA");
		
		Football c=new Football();//object creation for instance S
		
		System.out.println("*******Team*******");
		
		System.out.println(country);
		System.out.println(colour);
		
		System.out.println(c.Player);
		System.out.println(c.jersey);
		
		System.out.println("*******Team*******");
		
		System.out.println(country2);
		System.out.println(colour2);
		
		System.out.println(c.Player2);
		System.out.println(c.jersey2);
		
		System.out.println("*******Team*******");
		
		System.out.println(country3);
		System.out.println(colour3);
		
		System.out.println(c.Player3);
		System.out.println(c.jersey3);
	}

}
