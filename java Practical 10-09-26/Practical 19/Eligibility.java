
/*9. Write a Java program to accept a student's marks and attendance percentage and determine whether the student is eligible 
to appear for the examination using nested if-else.*/
import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter attendance percentage (without %): ");
        int attendance = sc.nextInt();

        if (marks >= 75) {
            if (attendance >= 75) {
                System.out.println("You are eligible to appear for the examination");
            } else
                System.out.println("You are not eligible because your attendance is below 75%.");
        } else {
            System.out.println("You are not eligible because your marks are below 75.");
        }

        sc.close();

    }
}
