package com.udemy.lambda.section6;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfance_Part1 {

	// Fuente de Datos
	static List<Student> listStudents = StudentDataBase.getAllStudents();
	
	// Consumers
	static Consumer<Student> cs = a -> System.out.println(a);
	static Consumer<Student> student = s -> System.out.println(s.getName());
	static Consumer<Student> grade = g -> System.out.println(g.getGradeLevel());
	static Consumer<Student> activities = a -> System.out.println(a.getActivities());
	static Consumer<Student> informationStudent = std -> {System.out.println(std.getName().concat(" - ").concat(String.valueOf(std.getGradeLevel()).concat(" - ").concat(std.getGender())));};
	
	public static void printAllStudents() {
		
		System.out.println("-------- printAllStudents --------");
		// Consumir por Lambda Consumer
		listStudents.forEach(cs);
		
		// Que seria lo mismo que cConsumir por Lambda directo
		listStudents.forEach(a -> System.out.println(a));
	}
	
	public static void printNameAndActivitiesAndGrade() {
		
		System.out.println("-------- printNameAndActivitiesAndGrade --------");
		listStudents.forEach(student.andThen(grade).andThen(activities));
	}
	
	public static void printNameAndActivitiesAndGradeUsingCondition() {
		System.out.println("-------- printNameAndActivitiesAndGradeUsingCondition --------");
		
		listStudents
			.stream()
			.filter(std -> std.getGradeLevel().equals(3))
			.forEach(informationStudent);
	}
	
	public static void main(String[] args) {
		
//		System.out.println("-------- Imprimir ejemplos simples --------");
		// ejemplos sencillos
		Consumer<String> consumer = a -> System.out.println(a.toUpperCase());
//		consumer.accept("mama");

		Consumer<Integer> consumerInteger = a -> System.out.println(a + 50 + 200);
//		consumerInteger.accept(50);

//		printAllStudents();
//		printNameAndActivitiesAndGrade();
		printNameAndActivitiesAndGradeUsingCondition();
	}

}
