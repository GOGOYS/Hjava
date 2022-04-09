package com.callor.app.service;

public class ServiceV1 {
	public void random() {
		int[] intNum = new int[10];
		intNum[0] = (int)(Math.random() *100)+1; 
		intNum[1] = (int)(Math.random() *100)+1; 
		intNum[2] = (int)(Math.random() *100)+1;
		intNum[3] = (int)(Math.random() *100)+1;
		intNum[4] = (int)(Math.random() *100)+1;
		intNum[5] = (int)(Math.random() *100)+1;
		intNum[6] = (int)(Math.random() *100)+1;
		intNum[7] = (int)(Math.random() *100)+1;
		intNum[8] = (int)(Math.random() *100)+1;
		intNum[9] = (int)(Math.random() *100)+1;
		System.out.println(intNum[1]);
		System.out.println(intNum[3]);
		System.out.println(intNum[6]);
		
	}
}
