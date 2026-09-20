import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num > 0) {
                System.out.println(num + " is Positive.");
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().toLowerCase().charAt(0);
        } while (choice == 'y');

        System.out.println("Program ended.");
        sc.close();
    }
}
