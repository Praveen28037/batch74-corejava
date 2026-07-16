package com.langfundamentals;

public class Iddemo2 {
	public static void main(String [] args) {
		System.out.println(sum());
		System.out.println(sum1());
	}
	static int sum() {
		int add=15-5;
		return add;//to return something we use return
	}
	
	static int sum1() {
		var add=0+28;//we can use var inside method for integer or charcter
		return add;
	}
}