package com.langfundamentals;
//Integer Literals
public class Literals {

	public static void main(String[] args) {
		//decimal literals -->base 10(0 to 9)
		int a1=10;
		int a2=123;
		int a3=567;
		
		// octal literals -->base 8(0 to 7)-->Starts with zero
		int a4=0123; //83-->0+ 1*8^2 +2*8^1 +3*8^0
		int a5=0654; //428
		int a6=0675; //445
//		int a7=0380;//The literal 0380 of type int is out of range ('8')
		
		//Hexa Decimal literals:base 16-->0 to 9 & a-f/A-F
		//hexa decimal starts with 0x or 0X
		//A/a=10,B/b=11......F/f=15
		int a7=0x123;//291
		int a8=0x1A2B;//6699
		int a9=0x345;//837
		int a10=0xabc;//2748
		int a11=0XbeE;//3054
//		int a12=0xbeer;  //Syntax error on token "r", delete this token
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
	}

}
