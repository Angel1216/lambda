package com.udemy.lambda.section6;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private Integer gradeLevel;
	private double gpa;
	private String gender;
	private List<String> activities = new ArrayList<String>();

	
	
	public Student(String name, Integer gradeLevel, double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	@Override
	public String toString() {
		return "Student{" +
				"name = " + name + " " +
				"gradeLevel = " + gradeLevel + " " +
				"gpa = " + gpa + " " +
				"gender = " + gender + " " +
				"activities = " + activities;
	}
	
	
}
