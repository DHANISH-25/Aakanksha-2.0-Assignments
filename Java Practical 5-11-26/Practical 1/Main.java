package com.demo;

class Student{
	private int studentId;
	private String name;
	private int age;
	private double marks;
	
	public void setStudentId(int studentId) {
		setStudentId(studentId);
	}
	
	public void setName(String name) {
		setName(name);
	}
	
	public void setAge(int age) {
		setAge(age);
	}
	
	public void setMarks(double marks) {
		setMarks(marks);
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public Student(int studentId, String name, int age, double marks) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void displayDetails() {
		System.out.println("Student name: " + getName());
		System.out.println("Student Id: " + getStudentId());
		System.out.println("Student age: " + getAge());
		System.out.println("Student marks: " + getMarks());
	}
	
}
public class Main {
	public static void main(String[] args) {
	Student st = new Student(245689, "Dhanish Kumar", 24, 99.10);
	st.displayDetails();
	}
}
