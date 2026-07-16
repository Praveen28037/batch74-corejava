package com.langfundamentals;

import java.math.BigInteger;

class Student{
	int sage;
	String sname;
	Address address;
}
class Address{
	String city;
}

public class TestDataTypes {
	String name = "Praveen";
	BigInteger bi = new BigInteger("12536478");

	public static void main(String[] args) {
		System.out.println("Datatypes method started");
		
		Student s1=new Student();
		s1.address.city="Warangel";
		s1.sage=21;
		s1.sname="Goutham";
		
		System.out.println(s1.sage);
		System.out.println(s1.sname);
		
		
		Student s2=new Student();
		s2.address.city="Hyd";
		s2.sage=22;
		s2.sname="Laxmikanth";
		
		System.out.println(s2.sage);
		System.out.println(s2.sname);
//		n System.out.println(s2.address);
	}

}
