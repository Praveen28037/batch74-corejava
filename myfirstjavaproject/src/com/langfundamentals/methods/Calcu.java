package com.langfundamentals.methods;

public class Calcu {

	void main(String[] args) {
		System.out.println("Main method Started");

		// calling no arg method
		addition();
		System.out.println("--------------------------------");

		// calling arg method
		addition(69, 90);

		System.out.println("--------------------------------");
		subtraction(28.0f, 10.00);

		System.out.println("--------------------------------");
		multiplication((byte) 23, (short) 21, 28, 10L, 31.3f, 34.2d);

		System.out.println("--------------------------------");
		quotient(100.0f, 4.0f);

		System.out.println("--------------------------------");
		remainder(29.0, 5);

	}

	void addition() {
		System.out.println("addition with no args called");
	}

	void addition(int a, int b) {
		System.out.println("addition with args called");
		int sum = a + b;
		System.out.println("addition of two numbers:" + sum);
	}

	void subtraction(float f, double d) {
		System.out.println("subtraction with args called");
		double diff = d - f;
		System.out.println("Difference of two numbers:" + diff);
	}

	void multiplication(byte b, short s, int i, long l, float f, double d) {
		System.out.println("Multipilication with args called");
		double mul = b * s * i * l * f * d;
		System.out.println("Multiplication of all numbers is :" + mul);
	}

	void quotient(float f, float f1) {
		System.out.println("Quotient with args called");
		float division = f / f1;
		System.out.println("Quotient of two numbers :" + division);
	}

	void remainder(double d, int i) {
		System.out.println("remainder with args called");
		double division = d % i;
		System.out.println("remainder of two numbers :" + division);
	}
}
