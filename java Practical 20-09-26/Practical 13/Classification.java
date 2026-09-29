/*13. Array Element Classification Write a Java program to input 15 integers into an array and classify every number as:

Positive Even

Positive Odd

Negative Even

Negative Odd

Zero


Display the count of each category.*/
import java.util.Scanner;

public class Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 15 numbers into an arrray: ");
        int arr[] = new int[15];

        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] %2 == 0) { 
                System.out.println(arr[i] + " positive even");
            } else if (arr[i] > 0 && arr[i] %2 != 0) {
                System.out.println(arr[i] + " Positive Odd");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] %2 == 0) { 
                System.out.println(arr[i] + " negative even");
            } else if (arr[i] < 0 && arr[i] %2 != 0) {
                System.out.println(arr[i] + " negative Odd");
            } else if(arr[i] == 0){
                System.out.println(arr[i] + " zero");
            }
        }

        sc.close();

    }
}