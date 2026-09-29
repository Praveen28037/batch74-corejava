package com.langfundamentals.operators;

//6)Bitwise operator : (& | ^ ~)
public class BitwiseOp {

	public static void main(String[] args) {
		
		int a=15;
		int b=7;
		int c=23;
		
		System.out.println("And Operator (&) ");//Everything should be true
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true); 
		System.out.println(false & false);	
		System.out.println(a > b & a > c);
		System.out.println("BitWise And (&)");
		System.out.println(85&36);//4 -->it will use binary method to get the answer
		System.out.println("****************");
		
		System.out.println("OR Operator (|)");//if one true also it works
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true); 
		System.out.println(false | false); 
		System.out.println(a > b | a > c);
		System.out.println("BitWise OR (|)");
		System.out.println(85|36);//117 --> Remember the binary scale (64 32 16 8 4 2 1)
		System.out.println("****************");
		
		System.out.println("BitWise XOR (^)");
		System.out.println(1^0);//1
		System.out.println(1^1);//0
		System.out.println(8^6);
		System.out.println();
		
		System.out.println("BitWise tilt (~)");
		System.out.println(~9);//-10
		System.out.println(~-9);//8
		System.out.println(~(-9));//8
	}
}