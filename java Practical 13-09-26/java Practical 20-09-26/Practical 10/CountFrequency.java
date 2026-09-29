/*10. Count Frequency of an Element Write a Java program to input 10 integers into an array and input another number from the user. Find how many times that number occurs in the array.

Example:

Array: 10 20 10 30 10 40
Search: 10
Output: 10 occurs 3 time*/

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 number in array");
        int arr[] = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter number to find how many times you entered that number into array: ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (num == arr[i]) {
                count++;
            }
        }

        System.out.println(num + " occurs " + count + " time");
        sc.close();

    }
}
