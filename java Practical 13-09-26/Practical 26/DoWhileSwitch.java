import java.util.Scanner;

public class DoWhileSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            
            if (choice == 6) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice! Please select an option between 1 and 6.");
                continue;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result: " +(num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("Error: Modulo by zero is undefined.");
                    } else {
                        System.out.println("Result: " + (num1 % num2));
                    }
                    break;
            }

        } while (choice != 6);

        scanner.close();
    }
}