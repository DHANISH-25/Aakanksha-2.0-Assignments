//10. Write a Java program to accept a person's age and income and determine the applicable loan eligibility category using an else-if ladder.

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Income: ");
        int income = sc.nextInt();

        if (age >= 18 && income >= 50000) {
            System.out.println("You are eligible for loan.");
        } else if (age < 18) {
            System.out.println("You are not eligible because you are under 18.");
        } else if (income < 50000) {
            System.out.println("You are not eligible because your income is below 50000.");
        }

        sc.close();
    }
}
