package com.langfundamentals;

public class TestidentifiersDemo_1 {
	
	int id_1;
	String name1;
	
	void method$1() {
		System.out.println("Method1 called");
	}

	public static void main(String[] args) {
				

		System.out.println("Main method Started");
		
		TestidentifiersDemo_1 t1=new TestidentifiersDemo_1();
		System.out.println(t1.id_1);
		System.out.println(t1.name1);
		t1.method$1();
	}

}
