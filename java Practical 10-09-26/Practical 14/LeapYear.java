//4. Write a Java program to accept a year and check whether it is a leap year or not using if-else.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check it is a leap year or not?: ");
        int year = sc.nextInt();

        if ((year%4) == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
