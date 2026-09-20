import java.util.Scanner;

public class MenuDrivenUtility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MENU ---");
        System.out.println("1. Check Even or Odd");
        System.out.println("2. Check Positive or Negative");
        System.out.println("3. Find Square and Cube");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (choice) {
            case 1: {
                if (num % 2 == 0) {
                    System.out.println(num + " is Even.");
                } else {
                    System.out.println(num + " is Odd.");
                }
            }
            case 2: {
                if (num > 0) {
                    System.out.println(num + " is Positive.");
                } else if (num < 0) {
                    System.out.println(num + " is Negative.");
                } else {
                    System.out.println("The number is Zero.");
                }
            }
            case 3: {
                System.out.println("Square of " + num + " = " + (num * num));
                System.out.println("Cube of " + num + " = " + (num * num * num));
            }
            default: System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
