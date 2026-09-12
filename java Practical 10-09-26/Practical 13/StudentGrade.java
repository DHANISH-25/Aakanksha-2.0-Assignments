//3. Write a Java program to accept a student's marks and display the grade using an else-if ladder.

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks to know your grade: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("Grade: A");

        else if (marks >= 80) 
            System.out.println("Grade: B");

        else if (marks >= 70)
            System.out.println("Grade: C");

        else 
            System.out.println("fail");

        sc.close();
    }
}
