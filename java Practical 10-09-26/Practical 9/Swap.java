
//9. Write a Java program to swap two numbers using a third variable and assignment operators.
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for swaping: ");
        int a = sc.nextInt();
        System.out.println("Enter second number for swaping: ");
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swapping.....");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();

    }
}
