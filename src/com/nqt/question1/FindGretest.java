package com.nqt.question1;

public class FindGretest {
	
	public static void main(String[] args) {
		
		String name = "nitiN";
		StringBuffer str = new StringBuffer(name);
		StringBuffer rev = str.reverse();
		
//		String name = "nitiN";
//		String rev = "";
//		
//		for(int i=0; i<name.length();i++) {
//			char a = name.charAt(i);
//			rev = a+rev;
//		}
//		
		System.out.println(name);
		System.out.println(rev);
		
		if(name.equalsIgnoreCase(rev.toString()))
			System.out.println("String is Palindrome");
		
		else
			System.out.println("String is not Palindrome ");
	}

}
