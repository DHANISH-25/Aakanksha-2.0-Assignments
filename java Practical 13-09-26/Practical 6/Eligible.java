
import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total mark: ");
        int mark = sc.nextInt();
        System.out.println("Enter your attendance percentage: ");
        int perc = sc.nextInt();

        if (mark >= 75) {
            if (perc >= 75) {
                System.out.println("You are Eligible for the Examination.");
            } else {
                System.out.println("You are not Eligible for Examination due to lac of percentage");
            }
        } else {
            System.out.println("You are not eligible for the Examination due to Your mark is not satisfy the codition.");
        }

        sc.close();
    }
}