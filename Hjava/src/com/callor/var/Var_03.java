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
		 
		 double douNum1 = dou();
		 System.out.println(douNum1);
		 
		 String str = Str();
		 System.out.println(str);
		 
	}
	
	public static double dou(){
		return 100.0000000;
	}
	public static String Str() {
		return "가느다란 물방울";
	}
}
