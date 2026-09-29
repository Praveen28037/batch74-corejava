package com.langfundamentals.operators;

//2)Assignment operator : (= += -= *= /= %=)
public class AssignmentOp {

	public static void main(String[] args) {

		float result = 15;

// 		Type mismatch: cannot convert from double to int
// 		result= result + 4.5; and also for -
//		result = (int) (result + 4.5); --> we can do it with type casting

		result += 4.5;// Narrowing
		System.out.println(result);

		result -= 3.5;
		System.out.println(result);

		result *= 2.5;
		System.out.println(result);

		result /= 3.5;
		System.out.println(result);

		result %= 3.5;
		System.out.println(result);
	}

}
