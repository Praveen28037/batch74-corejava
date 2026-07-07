package com.javaintroduction;

public class Cricketer {
	
	//declaration
	//static variables
	static int countryId =3;
	static String countryName ="India";

	public static void main(String[] args) {

		System.out.println("Welcome to Indian Cricket Team");
		
		//Accessing dircetly from static block
		System.out.println(countryId);
		System.out.println(countryName);
		
		//Accessing by class name
		System.out.println(Cricketer.countryId);
		System.out.println(Cricketer.countryName);
		
		//Accessing by creating an object
		Cricketer p=new Cricketer();//object creation
		
		System.out.println(p.countryId);
		System.out.println(p.countryName);
	}

}
