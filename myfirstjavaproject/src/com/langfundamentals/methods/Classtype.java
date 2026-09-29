package com.langfundamentals.methods;

class Student1{
	int sid;
	String sname;
	long phone;
	int age;
	String city;
	String street;
	String state;
}

public class Classtype {

	void getStudentInfo(Student1 s) {
		
		System.out.println("Student ID:" + s.sid);
		System.out.println("Student Name:" + s.sname);
		System.out.println("Student Phone Number:" + s.phone);
		System.out.println("Student Age:" + s.age);
		System.out.println("Student City:" + s.city);
		System.out.println("Student Street:" + s.street);
		System.out.println("Student State:" + s.state);
	}
	public static void main(String[] args) {
		
		Classtype c=new Classtype();
		
		Student1 s=new Student1();
		
		s.sid=35;
		s.sname="Praveen";
		s.phone=1243579780l;
		s.age=23;
		s.city="Mancherial";
		s.street="Pulimadugu";
		s.state="TG";
		
		c.getStudentInfo(s);
	}

}
