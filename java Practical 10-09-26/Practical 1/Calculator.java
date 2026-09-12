//1. Write a Java program to accept two numbers and calculate their sum, difference, product, quotient, and remainder using arithmetic operators.
import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = data.nextInt();
		System.out.println("Enter second number: ");
		int num2 = data.nextInt();
		int sum = num1 + num2;
		int dif = num1 - num2;
		int prod = num1 * num2; 
		double quot = (double) num1 / num2;
		int rem = num1 % num2;
		System.out.println("Two numbers Sum is: " + sum);
		System.out.println("Two numbers difference is: " + dif);
		System.out.println("Two numbers product is: " + prod);
		System.out.println("Two numbers quotient is: " + quot);
		System.out.println("Two numbers remainder is: " + rem);
		data.close();
		}
} 