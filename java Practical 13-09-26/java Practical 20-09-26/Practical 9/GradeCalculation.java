

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 number for array: ");
        double marks[] = new double[5];

        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        double percentage = (total/500.0) * 100;

        if (percentage >= 90) {
            System.out.println("Your Grade: A+");
        }else if (percentage >= 80) {
            System.out.println("Your Grade: A");
        }
        else if (percentage >= 70) {
            System.out.println("Your Grade: B");
        }
        else if (percentage >= 60) {
            System.out.println("Your Grade: C");
        }
        else if (percentage >= 50) {
            System.out.println("Your Grade: D");
        }
        else if (percentage >= 40) {
            System.out.println("Your Grade: E");
        }else {
            System.out.println("You Fail(Grade: F)");
        }
        sc.close();

    }
}
