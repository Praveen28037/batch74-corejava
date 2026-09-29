package com.langfundamentals.constructors;

public class School {

	// Another example for arg constructors
	String schoolName;
	String principal;
	String student;
	String Class;
	int rollNo;
	double fees;

	School(String schoolName) {
		this.schoolName = schoolName;
	}
	
	School(String schoolName, String principal) {
		this.schoolName = schoolName;
		this.principal = principal;
	}

	School(String schoolName, String principal, String student) {
		this.schoolName = schoolName;
		this.student = student;
		this.principal = principal;
	}

	School(String schoolName, String principal, String student, String Class) {
		this.schoolName = schoolName;
		this.principal = principal;
		this.student = student;
		this.Class = Class;
	}

	School(String schoolName, String principal, String student, String Class, int rollNo) {
		this.schoolName = schoolName;
		this.principal = principal;
		this.student = student;
		this.Class = Class;
		this.rollNo = rollNo;
	}

	School(String schoolName, String principal, String student, String class1, int rollNo, double fees) {
		this.schoolName = schoolName;
		this.principal = principal;
		this.student = student;
		Class = class1;
		this.rollNo = rollNo;
		this.fees = fees;
	}

	public static void main(String[] args) {

		School s = new School("Sri Ushodaya");
		s.schoolInfo();

		School s1 = new School("Sri Ushodaya", "Y balaji");
		s1.schoolInfo();

		School s2 = new School("Sri Ushodaya", "Y balaji", "Y Praveen Kumar");
		s2.schoolInfo();

		School s3 = new School("Sri Ushodaya", "Y balaji", "Y Praveen Kumar", "8-CBSE");
		s3.schoolInfo();

		School s4 = new School("Sri Ushodaya", "Y balaji", "Y Praveen Kumar", "8-CBSE", 22);
		s4.schoolInfo();

		School s5 = new School("Sri Ushodaya", "Y balaji", "Y Praveen Kumar", "8-CBSE", 22, 35000);
		s5.schoolInfo();
	}
	void schoolInfo() {
		System.out.println("-------My School Info------");
		System.out.println("School Name : " + schoolName);
		System.out.println("Principal Name : " + principal);
		System.out.println("Student Name : " + student);
		System.out.println("Student Class : " + Class);
		System.out.println(" Roll Number: " + rollNo);
		System.out.println("Fees : " + fees);
	}
}
