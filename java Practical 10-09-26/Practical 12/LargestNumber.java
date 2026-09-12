//2. Write a Java program to accept three numbers and find the largest number using nested if-else.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers to find largest number");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num3 = sc.nextInt();

        if (num1>=num2) {
            if (num1>=num3) 
                System.out.println(num1 + " is largest number");
            else
            System.out.println(num3 + " is largest number");
        } 
        else {
              if (num2>=num3) 
                System.out.println(num2 + " is Largest number");
             else 
                System.out.println(num3 + " is Largest number");
            
        }

        sc.close();
    }
}
