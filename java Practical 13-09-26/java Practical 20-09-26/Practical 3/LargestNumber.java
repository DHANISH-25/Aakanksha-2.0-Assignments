import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        System.out.println("Largest number: " + largestNumber);
        sc.close();
    }
}
