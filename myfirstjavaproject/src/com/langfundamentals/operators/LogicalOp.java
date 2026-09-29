package com.langfundamentals.operators;

//5)Logical operator : (&& || !)
public class LogicalOp {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		int c = 7;

		// Normal Explaination , How it Works

		System.out.println("And Operator (&&) ");//Everything should be true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); // -->Dead Code
		System.out.println(false && false); // -->Dead Code

		// dead code: initially if it is false then it is considered as dead code
		System.out.println(a > b && a > c);// false -->dead code
		System.out.println(b > a && c > b);// true (Both are True)
		System.out.println("****************");
		// using if loop
		System.out.println("Answer By ifelse Condition");
		if (a == c && b == c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("****************");
		
		System.out.println("OR Operator (||)");//if one true also it works
		System.out.println(true || true); //Dead Code
		System.out.println(true || false); //Dead Code
		System.out.println(false || true); 
		System.out.println(false || false); 

		// dead code:In this if first one is true then it is considered as dead code
		System.out.println(a > b || a > c);
		System.out.println(b > a || b > c);
		System.out.println("****************");
		
		System.out.println("Answer By ifelse Condition");
		if (a == c || b == c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("****************");
		
		System.out.println("NOT Operator (!)");
		System.out.println(!true);//false
		System.out.println(!false);//true
	}
}