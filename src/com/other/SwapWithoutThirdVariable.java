package com.other;

public class SwapWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int a = -34;
		int b = 0;
		System.out.println("a = "+a +"  " +" b = "+b);
		
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a +"  " +" b = "+b);
		
		
	}

}
