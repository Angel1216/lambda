package com.udemy.lambda.section2.lecture3;

import java.util.stream.IntStream;

public class Example1 {
	
	/*
	 * Example 1
	 * Sum of 100 numbers from 0 to 100 
	 */
	
	public static void main(String[] args) {

		// Imperative - how style of programming
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
		
		System.out.println("Sum using Imperative Approach: " + sum);
		
		
		// Declaritive style of programming - what style of programming
		
		int sum1 = IntStream.rangeClosed(0, 100).sum();
		
		System.out.println("Sum using Declarative Approach: " + sum1);
			
	}

}
