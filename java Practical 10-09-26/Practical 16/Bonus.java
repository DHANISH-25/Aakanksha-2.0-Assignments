/*6.Write a Java program to accept an employee's salary and years of experience and determine whether the employee is eligible 
for a bonus using nested if-else.*/
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.println("Enter your years of exprience: ");
        int years = sc.nextInt();

        if (salary < 70000) {
            if (years > 2) {
                System.out.println("You are Eligible for a Bonus.");
            } else {
             System.out.println("You are not eligible for Bonus Because you don't have needed exprience.");   
            }            
        } else {
            System.out.println("you are not eligible for bonus based on your salary.");   
        }

        sc.close();
    }
}
