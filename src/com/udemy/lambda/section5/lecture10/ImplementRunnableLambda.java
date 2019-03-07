package com.udemy.lambda.section5.lecture10;

public class ImplementRunnableLambda {
	
	public static void main(String[] args) {

		/*
		 * Prior JAVA 8
		 */
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};
		
		new Thread(runnable).start();
		
		/*
		 * JAVA 8 lambda
		 */
		Runnable runnable2 = () -> {
			System.out.println("Inside Runnable 2");
			System.out.println("Inside Runnable 2.1");
		};
		
		new Thread(runnable2).start();
		
		Runnable runnablelambda2 = () -> System.out.println("Inside Runnable 3");
		new Thread(runnablelambda2).start();
		
		new Thread(() -> System.out.println("Inside Runnable 4")).start();
	}

}
