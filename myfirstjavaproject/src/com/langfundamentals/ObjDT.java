package com.langfundamentals;//object Data Types

import java.math.BigDecimal;
import java.math.BigInteger;

class animal{
	
}
class bird{
	
}
public class ObjDT {
	//instance variables
	//Pre-Defined Object Data Types
	String s ="Praveen";//String Literals-->SCP(String Constant Pool)]
	String str=new String("Java");//String Object -->Heap Area
	
//	StringBuffer s01 ="CSE"; ->Type mismatch: cannot convert from String to StringBuffer
	StringBuffer s1 =new StringBuffer("CSE");
	StringBuilder s2=new StringBuilder("GNI");
	
//	BigInteger b01=2000; ->Type mismatch: cannot convert from int to BigInteger
	BigInteger b1=new BigInteger("209658758329753828");
	BigInteger b1i=new BigInteger("5");
	
	BigDecimal b2=new BigDecimal("55.5");
	BigDecimal b2i=new BigDecimal("33.3");
	
	//Wrapper Object Data Types
	Integer i=100;
	Character c='P';
	Float f=23.453F;
	Double d=135.10;
	
	//User-Defined Data Types 
	animal a;
	bird h;
	
	Integer i5=100;
	Integer i6=100;
	
	Integer i7=130;
	Integer i8=130;

	public static void main(String[] args) {
		System.out.println("Main Method Start");
		ObjDT t=new ObjDT();
		
		System.out.println(t.s);
		System.out.println(t.str);
		System.out.println(t.s1);
		System.out.println(t.s2);
		
		System.out.println(t.b1);
		System.out.println("Addition of two BigInteger");
		System.out.println(t.b1.add(t.b1i));//adding 2 numbers
		
		System.out.println(t.b2);
		System.out.println("Multiplication of two BigDecimal");
		System.out.println(t.b2.multiply(t.b2i));
		
		System.out.println(t.i);
		System.out.println(t.c);
		System.out.println(t.f);
		System.out.println(t.d);
		
		System.out.println(t.a);
		System.out.println(t.h);
		
		System.out.println(t.i5==t.i6);//true -->Stores in same position
		System.out.println(t.i7==t.i8);//false -->stores in diff positions
	}

}
