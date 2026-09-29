import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers in an array to find second largest number: ");
        int arr[] = new int[10];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largestNumber=arr[0]; 
        int secondLargest=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                secondLargest = largestNumber;
                largestNumber = arr[i];
            }else if (arr[i] > secondLargest && arr[i] != largestNumber) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The Second Largest number is: " + secondLargest);
        sc.close();
    }
}
