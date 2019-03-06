package com.udemy.lambda.section2.lecture3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
	
	/*
	 * Example 2
	 * Removing duplicates from a list of integers
	 */
	
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9, 10, 10, 10);
		
		System.out.println("integerList: " + integerList);
		
		/*
		 * Imperative
		 */
		List<Integer> uniqueList = new ArrayList<>();
		
		for(Integer integer : integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		
		System.out.println("uniqueList: " + uniqueList);
		
		/*
		 * Declarative
		 */
		List<Integer> uniqueList1 = new ArrayList<>();
		
		uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("uniqueList1:" + uniqueList1);
	}
}
