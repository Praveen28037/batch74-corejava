package com.langfundamentals.logicalstatements;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full name : ");
		String name = sc.nextLine();

		System.out.println("Full name is : " + name);
		sc.close();
	}
}