package com.callor.java;

public class Var_02 {
	public static void main(String[] args) {
		
		int intNum1 =0;
		int intNum2 =0;
		
		
		System.out.printf("%d + %d = %d", ++intNum1, intNum2++, intNum1 + intNum2);
		System.out.printf("%d + %d = %d", intNum1++, intNum2++, intNum1 + intNum2);
		System.out.printf("%d + %d = %d", ++intNum1, ++intNum2, intNum1 + intNum2);
		System.out.printf("%d + %d = %d", intNum1++, ++intNum2, intNum1 + intNum2);
	}

}
