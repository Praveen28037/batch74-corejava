package com.javaintroduction;

public class Block {

	// Instance block
	{
		System.out.println("Instance block Executed");
	}

	// Static block
	static {
		System.out.println("Static block Executed");
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");

		Block i = new Block();

		System.out.println("Main method Ended");

	}

}
