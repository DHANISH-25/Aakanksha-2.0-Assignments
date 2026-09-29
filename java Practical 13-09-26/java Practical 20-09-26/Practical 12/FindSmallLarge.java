/*12. Find Largest and Smallest Write a Java program to input 10 integers into an array and find the largest and smallest numbers.

Also display whether the difference between them is:

Greater than 50

Between 20 and 50

Less than 20 
*/
import java.util.Scanner;

public class FindSmallLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10 numbers into an array: ");
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest= arr[i];
                
            }
        }
        System.out.println(largest + " is largest number");

          for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                

            }
        }
        System.out.println(smallest + " is smallest number");

        int difference = largest - smallest;
        System.out.println("Difference: " + difference);

        if (difference > 50) {
            System.out.println("Difference is Greater than 50");
        }else if (difference >= 20 && difference <= 50) {
            System.out.println("Difference is Between 50 and 20");
        }else {
            System.out.println("Difference Less than 20");
        }

        sc.close();
    }
}