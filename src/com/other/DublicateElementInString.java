package com.other;

public class DublicateElementInString {
	
	public static void main(String[] args) {
		
		String string1 = "vaibhav korde";
		int count = 0;
		
		char string[] = string1.toCharArray();
		
		for(int i = 0; i<string1.length(); i++) {
			
			for(int j= i+1; j<string1.length();j++) {
		
				
				if(string[i] == string[j]) {
					count++;
					string[i]='0';	
				}	
			}
		}
		
		System.out.println(count);
	}

}
