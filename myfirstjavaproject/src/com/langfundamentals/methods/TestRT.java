package com.langfundamentals.methods;

//Java Marks → return marks
//Python Marks → return marks
//DBMS Marks → return marks
//OS Marks → return marks
//CN Marks → return marks

import java.util.Scanner;

public class TestRT {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		TestRT t2 = new TestRT();

		float java=t2.java();
		float py=t2.python();
		float db=t2.dbms();
		float cn=t2.cn();
		float os=t2.os();

		System.out.println("Total Marks =" + (java + py + db + cn + os));
	}

	float java() {
		System.out.println("Enter Java Marks:");
		float jmarks = sc.nextFloat();
		return jmarks;
	}

	float python() {
		System.out.println("Enter Python Marks:");
		float pmarks = sc.nextFloat();
		return pmarks;
	}

	float dbms() {
		System.out.println("Enter DBMS Marks:");
		float dbmarks = sc.nextFloat();
		return dbmarks;
	}

	float os() {
		System.out.println("Enter OS Marks:");
		float osmarks = sc.nextFloat();
		return osmarks;
	}

	float cn() {
		System.out.println("Enter CN Marks:");
		float cnmarks = sc.nextFloat();
		return cnmarks;
	}
}
