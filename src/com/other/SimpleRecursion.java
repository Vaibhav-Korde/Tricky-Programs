package com.other;

public class SimpleRecursion {
	
	int i = 0;
	public void recursion() {
		if(i != 101) {
			System.out.println(i);
			i++;
			recursion();	
		}
		
		
	}
	
	
	public static void main(String[] args) {
		SimpleRecursion obj = new SimpleRecursion();
		
		obj.recursion();
		
	}

}
