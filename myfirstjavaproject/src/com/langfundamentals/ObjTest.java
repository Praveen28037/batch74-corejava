package com.langfundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
public class ObjTest {
	BigInteger b1=new BigInteger("2096");
	BigInteger b1i=new BigInteger("53");
	
	BigDecimal b2=new BigDecimal("55.5");
	BigDecimal b2i=new BigDecimal("33.3");
	public static void main(String[] args) {
		System.out.println("Home Work");
		System.out.println("------------------------------------");
		ObjTest t=new ObjTest();
		System.out.println("Addition of two BigInteger");
		System.out.println(t.b1.add(t.b1i));//adding 2 numbers
		System.out.println("********************************");
		System.out.println("Multiplication of two BigInteger");
		System.out.println(t.b1.multiply(t.b1i));
		System.out.println("********************************");
		System.out.println("Division of two BigInteger");
		System.out.println(t.b1.divide(t.b1i));
		System.out.println("********************************");
		System.out.println("Subtraction of two BigInteger");
		System.out.println(t.b1.subtract(t.b1i));
		System.out.println("------------------------------------");
		System.out.println("Addition of two BigInteger");
		System.out.println(t.b2.add(t.b2i));//adding 2 numbers
		System.out.println("********************************");
		System.out.println("Multiplication of two BigDecimal");
		System.out.println(t.b2.multiply(t.b2i));
		System.out.println("********************************");
		System.out.println("Subtraction of two BigDecimal");
		System.out.println(t.b2.subtract(t.b2i));
		
		
	}

}
