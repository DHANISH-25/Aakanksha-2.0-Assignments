/*16. Array Result Processing Write a Java program to input the marks of 10 students into an array and display the following:

Highest marks and student index

Lowest marks and student index

Average marks

Number of students scoring ≥ 75

Number of students scoring 60–74

Number of students scoring 40–59

Number of failed students
 */

import java.util.Scanner;

public class ArrayResultProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 10 students into an array: ");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int highest = arr[0];
        int lowest = arr[0];
        int highIndex = 0;
        int lowIndex = 0;
        int total = 0;
        int above75 = 0;
        int between60_74 = 0;
        int between40_59 = 0;
        int failed = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
                highIndex = i;
            }

            if (arr[i] < lowest) {
                lowest = arr[i];
                lowIndex = i;
            }

            if (arr[i] >= 75) {
                above75++;
            } else if (arr[i] >= 60) {
                between60_74++;
            } else if (arr[i] >= 40) {
                between40_59++;
            } else {
                failed++;
            }

            total += arr[i];
        }

        double average = (double) total / arr.length;

        System.out.println(highest + " is highest marks on index number " + highIndex);
        System.out.println(lowest + " is lowest marks on index number " + lowIndex);
        System.out.println("Average: " + average);
        System.out.println("Number of students scoring ≥ 75: " + above75);

        System.out.println("Number of students scoring 60 >= 74: " + between60_74);

        System.out.println("Number of students scoring 40 >= 59: " + between40_59);

        System.out.println("Number of failed students: " + failed);

        sc.close();
    }
}