//6. Write a Java program to accept a number and calculate its square and cube using arithmetic operators.
import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to calculate square and cube: ");
        int num = sc.nextInt();

        int square = num*num;
        int cube = num*num*num;

        System.out.println("Square of "+num+" is: "+square);
        System.out.println("Cube of "+num+" is: "+cube);
        sc.close();
    }
    
}