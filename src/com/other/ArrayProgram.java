package com.other;

public class ArrayProgram {
	
	public static void main(String[] args) {
		
		int arr[] = {200,70,0,7,92,2,1,6,55,-1};
		
		int min = arr[0];
		
		for (int i = 1; i<arr.length;i++) {
	
			if(min > arr[i]) {
				
				min = arr[i];
				
			}
			
		}
		System.out.println(min);
		
	}

}
