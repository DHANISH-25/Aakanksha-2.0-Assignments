package com.demo;

class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length) {
		setLength(length);
	}
	
	public void setWidth(double width) {
		setWidth(width);
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void area() {
		double area = length * width;
		System.out.println("Area of Rectangle: " + area);
	}
	
	public void perimeter() {
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}

public class Main3 {
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(25.23, 85.02);
		rc.area();
		rc.perimeter();
	}
}
