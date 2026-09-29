package com.langfundamentals.methods;

//return type + no arguments

public class TestD {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		TestD t = new TestD();
		double sal = t.getEmployeeSalary();
		double bonus = t.getBonus();

		System.out.println("Total Salary :" + (sal + bonus));

		System.out.println("Main method Ended");
	}

	double getEmployeeSalary() {
		double salary = 45000.0;
		return salary;
	}

	double getBonus() {
		double bonus = 5000;
		return bonus;
	}

	// Other methods
	// double getEmployeeSalary() {
	// return 45000;
	// }

	// double getBonus() {
	// return 5000;
	// }
}
