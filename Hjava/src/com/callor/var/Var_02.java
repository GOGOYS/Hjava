package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {	
		
		boolean bYes = true;
		
		int intNum1 = 10;
		
		int intNum2 = 20;
		
		
		if (intNum1 < ++intNum2 || intNum1 < ++intNum2) {
			System.out.println(intNum1);
			System.out.println(intNum2);
		}
	
		// or연산일때 앞의 연산이 트루면 뒤의 연산은 실행하지 않음
		//고로 intNum2의 값은 1만 증가됨
		
		if (intNum1 < ++intNum2 && intNum1 < ++intNum2) {
			System.out.println(intNum2);
		}
		// and 연산은 모두 트루여야 되서 뒤문장까지 연산을 해줌
		//앞이 펄스면 뒷까지 연산을 안한다.
	}
}
