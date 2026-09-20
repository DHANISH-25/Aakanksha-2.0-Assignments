

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for swaping: ");
        int a = sc.nextInt();
        System.out.println("Enter second number for swaping: ");
        int b = sc.nextInt();
       
        if ((a%5 == 0) && (b%10 == 0)) {
            System.out.println("The number is divisible by 5 and 10.");
        }else{
            System.out.println("Given number is not divisible by both numbers.");
        }
        sc.close();

    }
}
