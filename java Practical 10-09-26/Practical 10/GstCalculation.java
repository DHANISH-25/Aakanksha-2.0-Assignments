/*10. Write a Java program to calculate the final amount of a product after applying a given discount percentage and 
dding GST percentage using arithmetic and assignment operators.*/

import java.util.Scanner;

public class GstCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount to check after applying discount and GST: ");
        double amount = sc.nextDouble();

        double discount = amount*5/100;
        System.out.println("Discount 5%: " + discount);
        double gst = amount*18/100;
        System.out.println("GST 18%: " + gst);

        double finalAmount = (amount + gst) - discount;

        System.out.println("Your Final Amount after applying Discount and GST is: " + finalAmount);

        sc.close();

    }
}
