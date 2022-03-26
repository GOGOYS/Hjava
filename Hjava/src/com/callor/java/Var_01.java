package com.callor.java;

public class Var_01 {
	public static void main(String[] args) {
		
		int intNum1;
		int intNum2;
		int intSum;
		
		intNum1 =1;
		intNum2 =3;
		
		intSum = intNum1 + intNum2;
		
		System.out.println(intSum);
		System.out.println(intSum++);
		System.out.println(intSum++);
		System.out.println(++intSum);
		System.out.println(++intSum);
		System.out.println(intSum++);
		System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intSum);
		
	}

}
