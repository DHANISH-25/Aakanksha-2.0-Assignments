
import java.util.Scanner;

public class StudentMarksResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 10 student: ");
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int failedCount = 0;
        int passCount = 0;
        int largestNumber = arr[0];
        int lowestNumber = arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i]>largestNumber) {
                largestNumber = arr[i];
            }

            if (arr[i]<lowestNumber) {
                lowestNumber = arr[i];
            }

            if (arr[i]>=40) {
                passCount++;
            }else {
                failedCount++;
            }

            sum += arr[i];
        }

        double average = (double)sum/arr.length;

        System.out.println("The Largest Marks: " + largestNumber);
        System.out.println("The Lowest Marks: " + lowestNumber);
        System.out.println("Average Marks: " + average);
        System.out.println("Number of Student who passed: " + passCount);
        System.out.println("Number of Student who failed: " + failedCount);

        sc.close();
    }
}