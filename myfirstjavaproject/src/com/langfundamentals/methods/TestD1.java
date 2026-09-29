package com.langfundamentals.methods;

import java.util.Scanner;

//return type + no arguments

public class TestD1 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		TestD1 t = new TestD1();
		double sal = t.getEmployeeSalary();
		double bonus = t.getBonus();

		System.out.println("Total Salary :" + (sal + bonus));

		System.out.println("Main method Ended");
	}

	double getEmployeeSalary() {
		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	double getBonus() {
		System.out.println("Enter Bonus : ");
		double bonus = sc.nextDouble();
		return bonus;
	}
}
