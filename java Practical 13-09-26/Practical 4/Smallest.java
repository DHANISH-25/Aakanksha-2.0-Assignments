
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers to find smallest number");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num3 = sc.nextInt();

        if (num1<=num2) {
            if (num1<=num3) 
                System.out.println(num1 + " is smallest number");
            else
            System.out.println(num3 + " is smallest number");
        } 
        else {
              if (num2<=num3) 
                System.out.println(num2 + " is smallest number");
             else 
                System.out.println(num3 + " is smallest number");
            
        }

        sc.close();
    }
}
