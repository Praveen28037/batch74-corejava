package com.langfundamentals.methods;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your First Name:");
		String fname = sc.nextLine();// if there are more than one word we use nextLine

		System.out.println("Enter your First Name:");
		String lname = sc.next();

		System.out.println("Enter your age:");
		int age = sc.nextInt();

		System.out.println("Enter your height:");
		float height = sc.nextFloat();

		System.out.println("Enter your weight:");
		double weight = sc.nextDouble();

		System.out.println("Enter your City Name:");
		sc.nextLine(); // if we write this String after int,float or double it will jump so we use an
						// extra sc.nextLine();
		String city = sc.nextLine();

		System.out.println("Enter your Gender:");
		char c = sc.next().charAt(0);

		TestDemo t = new TestDemo();

		// call by value
		t.getName(fname, lname);
		t.getAge(age);
		t.getHeight(height);
		t.getweight(weight);
		t.CityInfo(city);
		t.Gender(c);

	}

	void getName(String fname, String lname) {
		System.out.println("Full name is:" + fname + " " + lname);
	}

	void getAge(int age) {
		System.out.println("Age is:" + age);
	}

	void getHeight(float height) {
		System.out.println("Height is:" + height);
	}

	void getweight(double weight) {
		System.out.println("Weight is:" + weight);
	}

	void CityInfo(String city) {
		System.out.println("City is:" + city);
	}

	void Gender(char G) {
		System.out.println("Gender is:" + G);
	}
}
