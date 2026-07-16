package com.langfundamentals;

//static + instance + local
public class Employee {
	
	//primitive + instance
	int id=123;
	
	//object +instance
	String name="Akhi";
	
	//primitive + Static
	static int orgId=29;
	static String orgName="AK";

	public static void main(String[] args) {
		Employee emp1=new Employee();
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		
		Employee emp2=new Employee();//new data
		emp2.id=234;
		emp2.name="Praveen";
		
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		
		Employee emp3=new Employee();//instance data didn't change it gives first data
		System.out.println(emp3.id);
		System.out.println(emp3.name);
		
		System.out.println("---Accessing static data directly---");
		System.out.println(orgId);
		System.out.println(orgName);
		
		System.out.println("---Accessing static data by using class---");
		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);
		
		System.out.println("---Accessing static data by using obj ref---");
		System.out.println(emp1.orgId);//The static field Employee.orgId should be accessed in a static way
		System.out.println(emp1.orgName);
		
		System.out.println("-----------------------");
		orgName="PAG";
		orgId=28;
		
		System.out.println(emp2.orgId);
		System.out.println(emp2.orgName);
		//static data changed and continue with the new data until another new entry is there
		Employee emp4=new Employee();
		System.out.println(emp4.orgId);
		System.out.println(emp4.orgName);
		
		Employee emp5=null;
		System.out.println(emp5.orgId);
		System.out.println(emp5.orgName);
		
//		System.out.println(emp5.name);//NPE
	}

}
