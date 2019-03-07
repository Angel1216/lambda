package com.udemy.lambda.section5.lecture10;

import java.util.Comparator;

public class ImplementCoparatorUsingLambda {
	
	public static void main(String[] args) {
		
		/*
		 * prior java 8
		 */		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		};
		System.out.println(comparator.compare(4,  8));
		
		
		/*
		 * java 8 lambda
		 */
		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
		System.out.println(comparatorLambda.compare(19, 17));
		
		Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
		System.out.println("comparatorLambda1: " + comparatorLambda1.compare(17, 17));
	}

}
