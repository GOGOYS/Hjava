package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() *100 + 1);
		
		System.out.println(intNum1);

		int intNum2 = num();
		System.out.println(intNum2);
		
		intNum2 += intNum2;
		System.out.println(intNum2);
		

		System.out.println(intNum2++);

		System.out.println(++intNum2);
		
		System.out.println(intNum2++);
		
		System.out.println(++intNum2);
	
		System.out.println(++intNum2);
		
		System.out.println(intNum2++);
		
	}
	
	public static int num() {
		return 10;
	}
}
