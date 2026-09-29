import java.util.Scanner;

public class EvenOddStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers in an array to find second largest number: ");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("All Even Numbers: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
                evenCount++;
                evenSum = evenSum + arr[i];
            }
        }

        System.out.println("All Odd numbers");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                System.out.println(arr[i] + " ");
                oddCount++;
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of Odd numbers: " + oddCount);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}