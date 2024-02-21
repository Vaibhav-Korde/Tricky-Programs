package com.other;

public class Greeksforgreeks {
	
	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer("greekforgreeks");
		 
		 for (int i = 0 ; i<name.length();i++) {

			 if(name.charAt(i) == name.charAt(i+1)) {
				 
				char a = name.charAt(i);
				String naa =Character.toString(a);
				naa.toUpperCase();
				StringBuffer n = name.replace(i, i+2, naa);
			 }
	
		 }
		 System.out.println(name);
	}

}
