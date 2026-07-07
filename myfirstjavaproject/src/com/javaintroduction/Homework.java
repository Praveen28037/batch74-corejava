package com.javaintroduction;

	//This program is acc to LIFO 
public class Homework{
	static Homework p=new Homework();//obj creation-->here we are creating in class level to avoid multi
			//creation of obj in static methods  
	
	//In  Static area we can call Static methods directly
	public static void main(String[] args) {
		System.out.println("Main method Started");
		method1();
		System.out.println("Main method Ended");
	}
	static void method1() {
		p.method2();
		System.out.println("Method 1 called");
	}
	void method2() {
		method4();//here we can directly call instance method inside instance area without obj ref variable
		System.out.println("Method 2 called");
	}
	static void method3() {
		method5();
		System.out.println("Method 3 called");
	}
	void method4() {
		method3();
		System.out.println("Method 4 called");
	}
	static void method5() {
		p.method6();
		System.out.println("Method 5 called");
	}
	void method6() {
		method7();
		System.out.println("Method 6 called");
	}
	static void method7() {
		p.method8();
		System.out.println("Method 7 called");
	}
	void method8() {
		method9();
		System.out.println("Method 8 called");
	}
	static void method9() {
		p.method10();
		System.out.println("Method 9 called");
	}
	void method10() {
		System.out.println("Method 10 called");
	}
}
