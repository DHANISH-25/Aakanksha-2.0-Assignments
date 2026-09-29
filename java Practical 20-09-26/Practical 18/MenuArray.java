/*18. Menu-Driven Array Program Write a Java program using Scanner and switch to create a menu-driven program:

1. Display all elements
2. Find largest
3. Find smallest
4. Calculate sum
5. Calculate average
6. Count even numbers
7. Count odd numbers
8. Search an element
9. Exit

Input the array once and allow the user to select operations from the menu. */

import java.util.Scanner;

public class MenuArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        // Input array only once
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Display all elements");
            System.out.println("2. Find largest");
            System.out.println("3. Find smallest");
            System.out.println("4. Calculate sum");
            System.out.println("5. Calculate average");
            System.out.println("6. Count even numbers");
            System.out.println("7. Count odd numbers");
            System.out.println("8. Search an element");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Array elements:");

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    break;

                case 2:
                    int largest = arr[0];

                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > largest) {
                            largest = arr[i];
                        }
                    }

                    System.out.println("Largest = " + largest);
                    break;

                case 3:
                    int smallest = arr[0];

                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < smallest) {
                            smallest = arr[i];
                        }
                    }

                    System.out.println("Smallest = " + smallest);
                    break;

                case 4:
                    int sum = 0;

                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    int total = 0;

                    for (int i = 0; i < arr.length; i++) {
                        total += arr[i];
                    }

                    double average = (double) total / arr.length;

                    System.out.println("Average = " + average);
                    break;

                case 6:
                    int evenCount = 0;

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            evenCount++;
                        }
                    }

                    System.out.println("Even numbers = " + evenCount);
                    break;

                case 7:
                    int oddCount = 0;

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 != 0) {
                            oddCount++;
                        }
                    }

                    System.out.println("Odd numbers = " + oddCount);
                    break;

                case 8:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == search) {
                            System.out.println(
                                search + " found at index " + i
                            );
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }

                    break;

                case 9:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}
