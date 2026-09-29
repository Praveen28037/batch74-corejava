package com.langfundamentals.constructors;

public class Employee {

	int eid;
	String ename;
	double sal;

	// no arg constructor
	Employee() {
		System.out.println("No Arg Constructor Called");

		eid = 3;
		ename = "Laxmikanth";
		sal = 45000.00;
	}
	
	//Parameterized Constructor 
	Employee(int eid,String ename,double sal){
		System.out.println("Parameterized Constructor Called");
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
		
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		System.out.println("------------------------------");

		Employee e = new Employee();
		e.display();
		
		System.out.println("------------------------------");
		
		Employee e2 = new Employee(4,"Goutham",43000);
		e2.display();
	}

	void display() {
		System.out.println("Employee Id:" + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Salary:" + sal);

	}

}
