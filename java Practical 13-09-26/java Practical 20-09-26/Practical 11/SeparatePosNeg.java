
/*11. Separate Positive, Negative and Zero Write a Java program to input 15 integers into an array and separately display:

Positive numbers

Negative numbers

Zeros

Count of each category

Sum of positive numbers

Sum of negative numbers */

import java.util.Scanner;

public class SeparatePosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 15 numbers into an array: ");
        int arr[] = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int sumOfPos = 0;
        int sumOfNeg = 0;

        
        System.out.print("Positive numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
                sumOfPos += arr[i];
                posCount++;
            }
        }

        System.out.print("\nNegative numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                sumOfNeg += arr[i];
                negCount++;
            }
        }

        System.out.print("\nZeros: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] + " ");
                zeroCount++;
            }
        }

        System.out.println(posCount + " times positive numbers appeard");
        System.out.println(negCount + " times negative numbers appeard");
        System.out.println(zeroCount + " times zero appeard");
        System.out.println("Sum of Positive numbers: " + sumOfPos);
        System.out.println("Sum of Negative numbers: " + sumOfNeg);

        sc.close();
    }

}
