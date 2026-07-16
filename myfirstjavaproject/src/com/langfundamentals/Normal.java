package com.langfundamentals;

public class Normal {
	static String s1="praveen";

	public static void main(String[] args) {
		
		String s1="Thirupathi";//-->SCP-->String Constant Pool-->Heap-->1 0bj
		String s2="Thirupathi";//-->0 objs
		
		String s3="Laxmi";//SCP-->1 obj
		
		String s4=new String("Sahithi");//1 Heap + 1 SCP
		
		System.out.println(Normal.s1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
