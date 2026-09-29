package com.langfundamentals.methods;

public class TestDemo2 {

	public static void main(String[] args) {

		TestDemo2 ts = new TestDemo2();

		System.out.println(ts.method1());
		System.out.println(ts.method2());

	}

	int method1() {
		char c = 'A';
		return c;
	}

	char method2() {
		return 100;
	}

}