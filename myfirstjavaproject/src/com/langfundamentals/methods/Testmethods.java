package com.langfundamentals.methods;

public class Testmethods {

	// no return type +no argument
	static void morning() {
		System.out.println("Morning method called");
	}

	public static void main(String[] args) {

		System.out.println("Main method Started");

		Testmethods t1 = new Testmethods();
		morning();
		t1.welcome();

		System.out.println("Main method Ended");
	}

	void welcome() {
		System.out.println("welcome method called");
	}

}
