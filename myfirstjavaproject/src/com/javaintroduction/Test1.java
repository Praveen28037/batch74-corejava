package com.javaintroduction;
		//v)Island of Isolation in GC
class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method From A");
	}
}
class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method From B");
	}
}

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		A Obj1=new A();
		B Obj2=new B();
		
		Obj1.b=Obj2;
		Obj2.a=Obj1;
		
		Obj1=null;
		Obj2=null;
		System.gc();
		
		System.out.println("Main Method Ended");
	}

}
