//7. Write a Java program to create a menu-driven calculator for addition, subtraction, multiplication, division, and modulus using switch-case.
import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU DRIVEN CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter your choice (1-5): ");
        int option = sc.nextInt();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Substraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division: " + (double)(num1 / num2));
                break;
            case 5:
                System.out.println("Modulus: " + (double)(num1 % num2));
                break;
        
            default:
                break;
        }

        sc.close();
    }
}
