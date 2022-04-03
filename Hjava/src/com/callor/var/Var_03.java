package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		int intNum1 = (int)(Math.random() * 100 +1);
		 System.out.println(intNum1);
		 
		 int intNum2 =10;
		 int intNum3 =20;
		 
		 if (intNum2 < intNum3 || intNum2 > intNum3) {
			 System.out.println("성공");
		 }
		 if (intNum2 < intNum3 && intNum2 > intNum3) {
			 System.out.println("실패");
		 }
	}
}
