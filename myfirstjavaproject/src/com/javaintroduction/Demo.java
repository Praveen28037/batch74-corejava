package com.javaintroduction;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Greetings !");
		
		Class.forName("java.lang.String");
		
		Class.forName("com.javaintroduction.Welcome");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	}

}
