package com.langfundamentals;

public class Typecastexp {
		//instance data
	//if we keep more than byte value it will throw CE
	//CE:Type mismatch: cannot convert from int to byte
	//So we have to use type casting on rhs add (byte) or change it to int
	//we are using explicit type casting-->converting int to byte explictly
	
		byte b=(byte) 130;
		byte b1=127;//this is the max range for byte-->2^7
		
		short s=32767;//2^15
		//Type mismatch: cannot convert from int to short
		short s1=(short) 32768;
		
		int i=2147483647;//2^31
//		int i=2147483648;-->The literal 2147483648 of type int is out of range
		int i1=(int) 2147483648L;//Type mismatch: cannot convert from long to int
		
//when we want to use mobile number or long values we use L or l at the end
		long l=9223372036854775807L;//2^63
//		The literal 9223372036854775808L of type long is out of range
		long l1=98L;//Here we are using explicit type casting,it is converting int to long

		float f=2.3876453783F;//Rhs is double for decimals.So, we have to keep f for float
		double d=237738348043738d;//for long values we have mention d or D
		double d1=23.7738348043738;//or like this we have specify decimals 

		char c='a';//Single qoute
		//ASCII codes -->A=65 to Z=90,a=97 to z=122
		char c1=85;
		char c2=105;//int can convert to char :implicit type casting
		int i5='H';//char can convert to int :implicit type casting
		boolean areYouRegular=false;
		
		public static void main(String[] args) {
			System.out.println("Main method Started");
			Typecastexp d=new Typecastexp();
			System.out.println("The value of byte is:" + d.b);
			System.out.println("The value of byte1 is:" + d.b1);
			System.out.println("The value of short is:" + d.s);
			System.out.println("The value of short1 is:" + d.s1);
			System.out.println("The value of int is:" +d.i);
			System.out.println("The value of int1 is:" +d.i1);
			System.out.println("The value of long is:" +d.l);
			System.out.println("The value of long1 is:" +d.l1);
			
			System.out.println("Float value:"+d.f);
			System.out.println("double value:" +d.d);
			System.out.println("double value:"+d.d1);
			
			System.out.println("char value:" +d.c);
			System.out.println("char value:" +d.c1);
			System.out.println("char value:" +d.c2);
			System.out.println("int value:" +d.i5);
			
			if(d.areYouRegular) {
				System.out.println("Data Types are simple");
			}
			System.out.println(d.areYouRegular);
		}
	}