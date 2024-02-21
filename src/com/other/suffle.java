package com.other;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class suffle {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> intList = Arrays.asList(intArray);
		Collections.shuffle(intList);
		intList.toArray(intArray);
		System.out.println(Arrays.toString(intArray));
		
		
		
		
		Integer[] arr = {58,85,69,75,85,36};
		List<Integer> intList2 = Arrays.asList(arr);
		Collections.shuffle(intList2);
		intList2.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
