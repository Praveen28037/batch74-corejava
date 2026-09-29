package com.langfundamentals.methods;

//Student Marks Information
//Student Name → String
//Roll Number → int
//Java Marks → float
//Python Marks → float
//Percentage → double
//Grade → char

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name:");
		String name = sc.nextLine();

		System.out.println("Enter Student RollNumber:");
		int rollnumber = sc.nextInt();

		System.out.println("Enter Java Marks:");
		float jmarks = sc.nextFloat();

		System.out.println("Enter Python Marks:");
		float pmarks = sc.nextFloat();

		System.out.println("Enter Student Percentage:");
		double percent = sc.nextDouble();

		System.out.println("Enter Student Grade:");
		char grade = sc.next().charAt(0);

		System.out.println("---------Student Marks Information---------");

		Student s = new Student();
		s.SName(name);
		s.rno(rollnumber);
		s.javamarks(jmarks);
		s.pythonmarks(pmarks);
		s.precentage(percent);
		s.Grade(grade);
	}

	void SName(String name) {
		System.out.println("Student name is:" + name);
	}

	void rno(int rollnumber) {
		System.out.println("Roll Number is:" + rollnumber);
	}

	void javamarks(float jmarks) {
		System.out.println("Obtained Marks in Java:" + jmarks);
	}

	void pythonmarks(float pmarks) {
		System.out.println("Obtained marks in Python:" + pmarks);
	}

	void precentage(double percent) {
		System.out.println("Percentage is:" + percent);
	}

	void Grade(char grade) {
		System.out.println("Grade is:" + grade);
	}

}
