package com.langfundamentals.operators;

//7)Shift operator : (<< >> >>>)
public class ShiftOp {

	public static void main(String[] args) {
		
		int a=75;
		int b=2;
		int c=-5;
		
		System.out.println("Left Shift <<");
		System.out.println(a<<b);
		System.out.println();
		System.out.println("Right Shift >>");
		System.out.println(a>>b);
		System.out.println();
		System.out.println("Unsigned Right Shift >>>");
		System.out.println(a>>>b);//same ans like right shift with +ve,with -ve it changes
		System.out.println(c>>>b);
	  //System.out.println(a<<<b); //Syntax error on token "<", delete this token
	}

}
