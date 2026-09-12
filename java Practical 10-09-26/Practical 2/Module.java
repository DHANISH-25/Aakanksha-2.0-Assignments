//2. Write a Java program to accept a three-digit number and calculate the sum of its digits using arithmetic and modulus operators.
import java.util.Scanner;

class Module{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three-digit number: ");
		int num = sc.nextInt();
		int temp = num;
		int num1 = num%10;
		num = num/10;
		int num2 = num % 10;
		num = num/10;
		int num3 = num%10;
		int sum = num1 + num2 + num3;
		
		System.out.println("Given number: " + temp);
		System.out.println("Sum of " + num3 + " + " + num2 + " + " + num1 + " is: " + sum);

		sc.close();
	}
}