package com.javaintroduction;

public class Customer {
	
	@Override
	protected void finalize(){
		System.out.println("Finalize Method called");
	}
	
	//out of scope or obj inside method
	void welcome() {
		Customer c1 =new Customer();
		System.out.println(c1);
	}
	void hello() {
		System.out.println("Welcome to GC");
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		//n number of objects can be created
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		
//		//com.javaintroduction.Customer@27716f4
//		System.out.println(c1);//gives the address of the obj
//		System.out.println(c2);
//		System.out.println(c3);
		
		c1=null;//i)nullifying the object
		Customer c4=new Customer();
		c4=c2;//ii)reassiging the object
		c4.welcome();//iii)out of Scope
		new Customer().hello();//iv)Anonymous obj
		System.gc();
		
		System.out.println(c1);
		System.out.println(c2);//27716f4
		System.out.println(c3);//8efb846
		System.out.println(c4);//2a84aee7 updates --> 27716f4
//		int c1Hash=0x27716f4;
//		System.out.println(c1Hash);//41359092
//		System.out.println(c1.hashCode());
	}
}
