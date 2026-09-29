package com.langfundamentals.operators;

//1)Arithmetic operator : (+ - * / %)
public class ArithmeticOp {

	public static void main(String[] args) {

		int a = 333;
		int b = 17;

		double d = 23.3;
		float f = 7.5F;

		// Note:String + Anything is String only, So we use () for variable calculations
		System.out.println("Sum of two Numbers is: " + (d + f));
		System.out.println("Difference of two Numbers is: " + (d - f));
		System.out.println("Product of two Numbers is: " + (d * f));
		System.out.println("Quotient of two Numbers is: " + (a / b));
		System.out.println("Remainder of two Numbers is: " + (a % b));
	}

}
