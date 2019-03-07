package com.udemy.lambda.section6;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
	
	public static List<Student> getAllStudents(){
		
		//2nd Grade Student
		Student studen1 = new Student("Angel", 2, 3.6, "male", Arrays.asList("activity1", "activity2", "activit3", "activity4"));
		Student studen2 = new Student("Diana", 2, 6.7, "female", Arrays.asList("activity1", "activity2", "activit3"));
		
		//2nd Grade Student
		Student studen3 = new Student("Zaida", 3, 7.2, "female", Arrays.asList("activity1", "activity2", "activit3", "activity4", "activit5", "activity6"));
		Student studen4 = new Student("Diana", 3, 9.2, "female", Arrays.asList("activity1", "activity2"));
		
		//2nd Grade Student
		Student studen5 = new Student("Sandra", 3, 8.3, "female", Arrays.asList("activity1", "activity2", "activit3", "activity4", "activit5", "activity6", "activit7", "activity8"));
		Student studen6 = new Student("Wendy", 3, 10.45, "female", Arrays.asList("activity1"));

		List<Student> students = Arrays.asList(studen1, studen2, studen3, studen4, studen5, studen6);
		
		return students;
	}
	
}
