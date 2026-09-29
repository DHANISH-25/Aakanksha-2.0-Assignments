
/*19. Student Performance Analyzer Write a Java program to input the name and marks of 5 students.

For each student, calculate the grade using conditional statements.

Display:

Name Marks Percentage/Grade Result

Also find:

Highest scorer

Lowest scorer

Class average

Number of passed students

Number of failed students */
import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[5];
        int[] arr = new int[5];

        // Input names and marks together to avoid Scanner buffer issues
        System.out.println("Enter details for 5 students:\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for Student " + (i + 1) + ": ");
            name[i] = sc.nextLine();

            System.out.print("Enter marks for " + name[i] + ": ");
            arr[i] = sc.nextInt();
            sc.nextLine(); // Clear newline character left by nextInt()
            System.out.println();
        }

        int total = 0;
        int highest = 0;
        int lowest = 0;
        int passed = 0;
        int failed = 0;

        // Header with fixed column widths (-18 left-aligns name up to 18 characters)
        System.out.printf("%-18s %-8s %-8s %-8s%n", "Name", "Marks", "Grade", "Result");
        System.out.println("--------------------------------------------------");

        // Calculate grade and result
        for (int i = 0; i < arr.length; i++) {

            String grade;

            if (arr[i] >= 90) {
                grade = "A+";
            } else if (arr[i] >= 80) {
                grade = "A";
            } else if (arr[i] >= 70) {
                grade = "B";
            } else if (arr[i] >= 60) {
                grade = "C";
            } else if (arr[i] >= 50) {
                grade = "D";
            } else if (arr[i] >= 40) {
                grade = "E";
            } else {
                grade = "F";
            }

            String result;

            if (arr[i] >= 40) {
                result = "Pass";
                passed++;
            } else {
                result = "Fail";
                failed++;
            }

            // Print formatted row
            System.out.printf("%-18s %-8d %-8s %-8s%n", name[i], arr[i], grade, result);

            total += arr[i];

            if (arr[i] > arr[highest]) {
                highest = i;
            }

            if (arr[i] < arr[lowest]) {
                lowest = i;
            }
        }

        double average = total / 5.0;

        System.out.println("\nHighest Scorer: " + name[highest] + " (" + arr[highest] + ")");
        System.out.println("Lowest Scorer: " + name[lowest] + " (" + arr[lowest] + ")");
        System.out.printf("Class Average: %.2f%%\n", average);
        System.out.println("Passed Students: " + passed);
        System.out.println("Failed Students: " + failed);

        sc.close();
    }
}