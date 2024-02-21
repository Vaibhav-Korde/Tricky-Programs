package com.other;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PushElement {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		SecureRandom sr = new SecureRandom();
	
		System.out.println("How many number to inter in list");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0 ; i <num ; i ++) {
			
			arr.add(sr.nextInt(200));
		}
		
		System.out.println(arr);
		
		arr.sort(null);
		System.out.println("After Sorting list");
		System.out.println(arr);
	}

}
