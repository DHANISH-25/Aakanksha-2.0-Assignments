/*14. Search and Position Write a Java program to input 10 integers into an array and search for a number entered by the user.

If found, display:

Whether it exists

Its first position/index

Number of times it occurs


If not found, display an appropriate message.
 */

import java.util.Scanner;

public class SearchPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 natural numbers into array: ");
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number to search is it in array or not?: ");
        int num = sc.nextInt();

        int firstPosition = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Number found");
                count++;
                if (firstPosition == -1) {
                    firstPosition = i;
                } 
            } 
        }
        if (count > 0) {
            System.out.println("Its first postion is: " + firstPosition);
            System.out.println(count + " times it occurs");
        }else 
            System.out.println("Number not found in an array.");
        
        
        sc.close();
    }
}
