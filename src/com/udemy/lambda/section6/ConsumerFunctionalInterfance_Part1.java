package com.udemy.lambda.section6;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfance_Part1 {
	
	public static void printName() {
		
		List<Student> listStudents = StudentDataBase.getAllStudents();
		
		// Consumir por Lambda directo
		listStudents.forEach(a -> System.out.println(a));
		
		System.out.println("-----------------------------------------------------");
		
		// Consumir por Lambda Consumer
		Consumer<Student> cs = a -> System.out.println(a);
		listStudents.forEach(cs);
	}
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = a -> System.out.println(a.toUpperCase());
		consumer.accept("mama");
		
		Consumer<Integer> consumerInteger = a -> System.out.println(a + 50 + 200);
		consumerInteger.accept(50);
		
		printName();
	}

}
