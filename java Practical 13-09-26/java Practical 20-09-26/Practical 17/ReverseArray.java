/*17. Reverse Array with Conditions Write a Java program to input 10 integers into an array and display the array in reverse order.

While displaying the reversed array:

Replace positive even numbers with "EVEN"

Replace positive odd numbers with "ODD"

Replace negative numbers with "NEGATIVE"

Replace zero with "ZERO" */

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        
        System.out.println("Enter 10 integers into an array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Reversed array:");

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > 0 && arr[i] % 2 == 0) {
                System.out.print("EVEN ");
            }
            else if (arr[i] > 0 && arr[i] % 2 != 0) {
                System.out.print("ODD ");
            }
            else if (arr[i] < 0) {
                System.out.print("NEGATIVE ");
            }
            else {
                System.out.print("ZERO ");
            }
        }

        sc.close();
    }
}
