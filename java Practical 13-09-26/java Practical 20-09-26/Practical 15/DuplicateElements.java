/*15. Duplicate Elements Write a Java program to input 10 integers into an array and find all the elements that occur more than once.

Also display the frequency of each duplicate element. */

import java.util.Scanner;

class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 integer numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");
    
        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            for (int j = 0; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }

        sc.close();
    }
}

