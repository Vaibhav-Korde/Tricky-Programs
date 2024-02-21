package com.other;

public class InterviewQue {
	
	public static int func(String alpha) {
	
		for(int i = 0; i< alpha.length(); i++) {
			
			char a = alpha.charAt(i);
			
			if(alpha.indexOf(a) == alpha.lastIndexOf(a)) {
				
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		String alpha = "abcde";
		
		System.out.println(func(alpha));
		
		
		
	}
	

}
