package com.langfundamentals.constructors;

public class Faculty {

	int fid;
	String fname;

	// No-arg Constructor
	Faculty() {
		System.out.println("No-Arg Constructor is called");
	}

	// Parameterized Constructor
	Faculty(int fid, String fname) {
		System.out.println("Parameterized Constructor Called");
		// we have to use this ,it helps to access class level instances
		this.fid = fid;
		this.fname = fname;// now it will take values
	}

	public static void main(String[] args) {

		System.out.println("Main Method Executed");
		// the below object is created by default constructor
		// Default constructor:whenever there is no constructors in program
		// the default constructor is provided by compiler
		Faculty f = new Faculty();
		f.display();
		
//		System.out.println(f.fid);
//		System.out.println(f.fname);

		Faculty f2 = new Faculty(28, "Praveen");
		f2.display();
		
//		System.out.println(f2.fid);
//		System.out.println(f2.fname);
	}
	
	//instead of writing mul print statements we created them in one method
	void display() {
		System.out.println(fid);
		System.out.println(fname);
	}

}
