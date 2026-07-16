package com.langfundamentals;

//primitive datatypes with instance data
//JVM will provide default values when obj is created(static data loads directly)
public class Datatypes {
	
	//instance data
	byte b;
	short s;
	int i;
	long l;

	float f;
	double d;

	char c;
	boolean bo;

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Datatypes d=new Datatypes();
		System.out.println(d.b);//0
		System.out.println(d.s);//0
		System.out.println(d.i);//0
		System.out.println(d.l);//0
		System.out.println(d.f);//0.0
		System.out.println(d.d);//0.0
		System.out.println(d.c);//single space (" ")
		System.out.println(d.bo);//false
	}

}
