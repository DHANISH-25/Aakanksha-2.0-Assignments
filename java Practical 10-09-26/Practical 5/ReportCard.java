//5. Write a Java program to accept marks of three subjects and calculate the total marks, percentage, and average using arithmetic operators.

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter your first subject mark: ");
        int sub1 = get.nextInt();
        System.out.println("Enter your second subject mark: ");
        int sub2 =  get.nextInt();
        System.out.println("Enter your third subject mark: ");
        int sub3 = get.nextInt();

        int total = sub1 + sub2 + sub3;
        double percentage = (double)total/300 * 100;
        double average = (double)total/3;
        System.out.println("Your Total Marks is: " + total);
        System.out.printf("Your total marks percent is: %.2f%%\n", percentage);
        System.out.printf("Your Total Marks average is: %.2f\n", average);

        get.close();
    }
}
