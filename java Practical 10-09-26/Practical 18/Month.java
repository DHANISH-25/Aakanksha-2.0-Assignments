//8. Write a Java program to accept a number from 1 to 12 and display the corresponding month name and number of days using switch-case.

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write from 1 to 12 for display the corresponding month name and number of days: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Month: January");
                System.out.println("Days: 31");
                break;
            case 2:
                System.out.println("Month: February");
                System.out.println("Days: 28 (29 Days in Leap year)");
                break;
            case 3:
                System.out.println("Month: March");
                System.out.println("Days: 31");
                break;
            case 4:
                System.out.println("Month: April");
                System.out.println("Days: 30");
                break;
            case 5:
                System.out.println("Month: May");
                System.out.println("Days: 31");
                break;
            case 6:
                System.out.println("Month: June");
                System.out.println("Days: 30");
                break;
            case 7:
                System.out.println("Month: July");
                System.out.println("Days: 31");
                break;
            case 8:
                System.out.println("Month: August");
                System.out.println("Days: 31");
                break;
            case 9:
                System.out.println("Month: September");
                System.out.println("Days: 30");
                break;
            case 10:
                System.out.println("Month: October");
                System.out.println("Days: 31");
                break;
            case 11:
                System.out.println("Month: November");
                System.out.println("Days: 30");
                break;
            case 12:
                System.out.println("Month: December");
                System.out.println("Days: 31");
                break;

            default:
                System.out.println("You are not entered number from 1 to 12 please write 1 to 12.");
                break;
        }

        sc.close();
    }
}
