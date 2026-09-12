//5. Write a Java program to accept a person's age and citizenship status and determine whether the person is eligible to vote using nested if-else

import java.util.Scanner;

public class Citizenship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Enter Your citizenship status. (yes/no): ");
        String citizenship = sc.next();

        if (age>=18) {
            if (citizenship.equals("yes")) {
                System.out.println("You are Eligible to vote. Happy Voting");                
            }else{
                System.out.println("You are not Eligible to vote due to citizenship status");
            }
        } else {
            System.out.println("You are not Eligible to vote please come after your age is greater than 18 and you have a citizenship status.");
            
        }

        sc.close();
    }
    
}